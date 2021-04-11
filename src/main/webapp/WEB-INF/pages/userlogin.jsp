<html>
<body style="background-color:grey;">
    User is trying to login at
    <br>
    <br>

    <div id="time" >

    </div>
    <br>
    <br>


    <script type="text/javascript">

            function updateTime(){
                document.getElementById("time").innerText=new Date().toString();
            }

            //every 1000 milliseconds later
            setInterval(updateTime,1000);

    </script>
</body>
</html>