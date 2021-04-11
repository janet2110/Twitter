<html>

<head>
   <link rel="icon" href="/static/images/favicon.ico?" type="image/x-icon">




    <script
    			  src="https://code.jquery.com/jquery-3.5.1.min.js"
    			  integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
    			  crossorigin="anonymous">
    </script>



    <style>
            body {
              background-color: #00acee ;
            }

            .form-container {
              /* margin: 100px auto; */
              padding: 30px;
              max-width: 350px;
              background: white;
              box-sizing: border-box;
            }

            .container {
              margin: 100px auto;
              max-width: 350px;
              /* background: white; */
              box-sizing: border-box;
            }

            .form-container .head {
              text-align: center;

              font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
            }

            .Inputs {
              padding-top: 50px;
            }

            form {
              width: 100%;
            }

            form label {
              display: block;
              font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
              color: black;
              line-height: 30px;
            }

            input {
              display: block;
              margin-bottom: 20px;
              width: 100%;
              padding: 5px;
              color:#A9A9A9 ;
              border: 1px solid rgb(100, 133, 133);
              border-radius: 5px;
              box-sizing: border-box;
            }

            button {
              display: block;
              margin-bottom: 30px;
              width: 100%;
              padding: 10px;
              background: #00acee ;
              border: hidden;
              color: white;
              font-weight: bold;
              font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
            }

            .footer {
              text-align: center;
              font-size: 10px;
              box-sizing: border-box;
              padding: 5px 20px;
              font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
            }

            a {
              text-decoration: none;
            }

            .signup {
              margin: 20px;
              text-align: center;
              color: white;
              /* font-weight: bold; */
              font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
            }

            .signup a {
              color: #00acee ;
            }

    </style>
</head>

<body>
<section id="signup-box">
       <form>

                 <div class="container">
                   <div class="form-container">
                     <div class="head">
                       <h3>Login your account</h3>
                       <p>Welcome to TWITTER</p>
                     </div>
                     <form class="Inputs">



                       <label for="email">Email</label>
                       <input id="signup-email" name="email" type="email" placeholder="Fill your email" />
                       <label for="password">Password</label>
                       <input id="signup-password" name="password" type="password" placeholder="Fill your password" />
                        <p style="color:red; display:none" id="signup-error"></p>
                       <button type="button" id="btn-signup">Login</button>
                     </form>

                 </div>

        </form>
</section>

    <script>
    function validateSignupForm(){
        var email=$("#signup-email").val();
        var password=$("#signup-password").val();

         var error="";

        if(!email){
             error+="Email is empty."
        }
        if(!password){
             error+="Password is empty."
        }
        //Password is not empty but length is less than 3
        if(!!password && password.length<=3){
            error+="Password length must be greater than 3 characters."
        }
        $("#signup-error").html(error);




        if(error.length>0){
            return false;
        }

        return true;

    }
          $("#btn-signup").click(function(){
          var validForm=validateSignupForm();
                              if(validForm){
                              $("#signup-error").hide();

                                       var email=$("#signup-email").val();
                                       var password=$("#signup-password").val();
                               var user={


                                              "email":email,
                                              "password":password

                                          };
                                          $.ajax({
                                            type: "POST",
                                            url: "/login/welcome",
                                            data: JSON.stringify(user),
                                            success: function(response){
                                            if(!!response){
                                              if(response.is_login===true){
                                              location.href="/user/welcome";
                                              }
                                              else{
                                              $("#signup-password").val("");
                                               $("#signup-error").html(response.message);
                                               $("#signup-error").show();

                                              }

                                            }

                                            },
                                            contentType: 'application/json'
                                            });
                              }
                              else{
                              $("#signup-error").show();
                              }

                      });
    </script>
</body>


</html>