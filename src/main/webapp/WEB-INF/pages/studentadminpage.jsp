<html>

<head>
   <link rel="icon" href="/static/images/favicon.ico?" type="image/x-icon">


    <script
    			  src="https://code.jquery.com/jquery-3.5.1.min.js"
    			  integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
    			  crossorigin="anonymous">
    </script>



    <style>
        * {
          margin: 0;
          padding: 0;
          font-family: "Poppins", sans-serif;
        }

        .hero {
          height: 100vh;
          width: 100%;
          background-image: linear-gradient(rgba(0, 0, 0, 0.4), rgba(0, 0, 0, 0.4)),
            url(https://i.postimg.cc/QCCpjgRN/vincent-chan-04-Kmj0pru5-M-unsplash.jpg);
          background-position: center;
          background-size: cover;
          background-repeat: no-repeat;
          position: absolute;
        }

        .form-box {
          width: 380px;
          height: 480px;
          position: relative;
          margin: 6% auto;
          background: #fff;
          padding: 5px;
          overflow: hidden;
        }

        .button-box {
          width: 220px;
          margin: 35px auto;
          position: relative;
          box-shadow: 0 0 20px 9px #4a3b54;
          border-radius: 30px;
        }

        .toggle-btn {
          padding: 10px 30px;
          cursor: pointer;
          background: transparent;
          border: 0;
          outline: none;
          position: relative;
        }

        #btn {
          top: 0;
          left: 0;
          position: absolute;
          width: 110px;
          height: 100%;
          background: linear-gradient(to right, #46588c, #d46e75);
          border-radius: 30px;
          transition: 0.5s;
        }

        .social-icons {
          margin: 30px auto;
          text-align: center;
        }

        .social-icons img {
          width: 30px;
          margin: 0 12px;
        }

        .input-group {
          top: 180px;
          position: absolute;
          width: 280px;
          transition: 0.5s;
        }

        .input-field {
          width: 100%;
          padding: 10px 0;
          margin: 5px 0;
          border-left: 0;
          border-top: 0;
          border-right: 0;
          border-bottom: 1px solid #999;
          outline: none;
          background: transparent;
        }

        .submit-btn {
          width: 85%;
          padding: 10px 30px;
          cursor: pointer;
          display: block;
          margin: auto;
          background: linear-gradient(to right, #46588c, #d46e75);
          border: 0;
          outline: none;
          border-radius: 30px;
        }

        .check-box {
          margin: 30px 10px 30px 0;
        }

        span {
          color: #777;
          font-size: 12px;
          bottom: 68px;
          position: absolute;
        }

        #login {
          left: 50px;
        }

        #register {
          left: 450px;
        }


    </style>
</head>

<body>
    <div class="hero">
      <div class="form-box">
        <div class="div button-box">
          <div id="btn"></div>
          <button type="button" class="toggle-btn" onclick="login()">Log In</button>
          <button type="button" class="toggle-btn" onclick="register()">Register</button>
        </div>

        <div class="social-icons">
          <img src="https://assets.codepen.io/3950346/IG.png" alt="" />
          <img src="https://assets.codepen.io/3950346/FB.png" alt="" />
          <img src="https://assets.codepen.io/3950346/YT.png" alt="" />
        </div>

        <form id="login" class="input-group">
          <input type="text" class="input-field" placeholder="Username" required>
          <input type="text" class="input-field" placeholder="Password" required>
          <input type="checkbox" class="check-box"><span>Remember Password</span>
          <button class="submit-btn" type="submit">Log In</button>
        </form>

        <form id="register" class="input-group">
          <input type="text" class="input-field" placeholder="Username" required>
          <input type="email" class="input-field" placeholder="Email" required>
          <input type="text" class="input-field" placeholder="Password" required>
          <input type="checkbox" class="check-box"><span>I agree to the terms & conditions</span>
          <button class="submit-btn" type="submit">Register</button>
        </form>
      </div>
    </div>
    <script>
            var x = document.getElementById("login");
            var y = document.getElementById("register");
            var z = document.getElementById("btn");

            function register() {
              x.style.left = "-400px";
              y.style.left = "50px";
              z.style.left = "110px";
            }

            function login() {
              x.style.left = "50px";
              y.style.left = "450px";
              z.style.left = "0px";
            }

    </script>
</body>


</html>