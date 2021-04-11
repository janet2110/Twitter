package tech.codingclub.helix.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import tech.codingclub.helix.global.HttpURLConnectionExample;


public class WikipediaDownloader  {

    //I want all objects to use the same taskmanager
    //i want a global taskmanager which can manage all threads related to wikipedia dowwnloader


    private String keyword;
    private String result;

    //default constructor
    public WikipediaDownloader(){

    }
    //constructor for methods
    public WikipediaDownloader(String keyword) {
        this.keyword = keyword;
    }

    public WikiResult getResult() {

        //1.get clean keyword
        //2.get url for wikipedia
        //3.make a get request to wikipedia
        //4.parsing the useful result using jsoup
        //5.showing results to the user

        if(this.keyword==null || this.keyword.length()==0)
            return null;
        //STEP 1
        //replace all spaces with underscore
        //trim the starting and ending spaces
        this.keyword=this.keyword.trim().replaceAll("[ ]","_");

        //STEP 2
        String wikiURL=getWikipediaURLForQuery(this.keyword);

        String response="";
        String image_url="";
        try {
            //STEP 3
            String wikipediaResponseHTML= HttpURLConnectionExample.sendGet(wikiURL);//ctrl+p//what parameter its expecting
            //System.out.println(wikipediaResponseHTML);

            Document document= Jsoup.parse(wikipediaResponseHTML,"https://en.wikipedia.org");

            //what we want to select in a document
            //we want to select all children in jsoup using " > *" symbol
            Elements childElements=document.body().select(".mw-parser-output > *");

            int state =0;


            for(Element childElement:childElements ){
                if(state==0)
                {
                    if(childElement.tagName().equals("table")){
                        state=1;
                    }
                }
                else if(state==1){
                    if(childElement.tagName().equals("table")){
                        state=2;
                        response=childElement.text();
                        break;
                    }
                }
               // System.out.println(childElement.tagName());
            }

            try{
               image_url= document.body().select(".infobox img").get(0).attr("src");

            }
            catch (Exception e){
                e.printStackTrace();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(image_url.startsWith("//")){
            image_url="https:"+image_url;
        }

        WikiResult wikiResult=new WikiResult(this.keyword,response,image_url);
        //push result into database

        //to print in a pretty way
      return wikiResult;



    }

    private String getWikipediaURLForQuery(String cleanKeyword) {
        return "https://en.wikipedia.org/wiki/"+cleanKeyword;
    }


  
}
