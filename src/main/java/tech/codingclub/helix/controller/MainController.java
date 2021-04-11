package tech.codingclub.helix.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import tech.codingclub.helix.database.GenericDB;
import tech.codingclub.helix.entity.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;

/**
 * User: rishabh
 */
@Controller
@RequestMapping("/")
public class MainController extends BaseController {

    private static Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/helloworld")
    public String getQuiz(ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {
        return "hello";
    }






    @RequestMapping(method = RequestMethod.GET, value = "/signup")
    public String signup(ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {
        return "signup";
    }



    @RequestMapping(method = RequestMethod.POST, value = "/signup")
    public
    @ResponseBody
    SignupResponse signupData(@RequestBody Member member, HttpServletResponse response, HttpServletRequest request) {



        boolean user_created=false;
        String message="";
        if(GenericDB.getCount(tech.codingclub.helix.tables.Member.MEMBER, tech.codingclub.helix.tables.Member.MEMBER.EMAIL.equal(member.email))>0){
            message="User already exists for this email id !!!";
        }
        else {
            member.role="cm";
            new GenericDB<Member>().addRow(tech.codingclub.helix.tables.Member.MEMBER,member);
            user_created=true;
            message="User Created !!!";
        }
        return new SignupResponse(message,user_created);
    }






    @RequestMapping(method = RequestMethod.GET, value = "/api/wiki")
    public @ResponseBody String getWikiResultGson(ModelMap modelMap,@RequestParam("country") String country, HttpServletResponse response, HttpServletRequest request) {

        WikipediaDownloader wikipediaDownloader=new WikipediaDownloader(country);
        WikiResult wikiResult=wikipediaDownloader.getResult();
        return new Gson().toJson(wikiResult);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/api/wiki/html")
    public  String getWikiResultHTML(ModelMap modelMap,@RequestParam("country") String country, HttpServletResponse response, HttpServletRequest request) {

        WikipediaDownloader wikipediaDownloader=new WikipediaDownloader(country);
        WikiResult wikiResult=wikipediaDownloader.getResult();


        modelMap.addAttribute("IMAGE", wikiResult.getImage_url());
        modelMap.addAttribute("DESCRIPTION", wikiResult.getText_result());

        return "wikiapi";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/handle")
    public
    @ResponseBody
    String handleEncrypt(@RequestBody String data, HttpServletRequest request, HttpServletResponse response) {
        return "ok";
    }
}