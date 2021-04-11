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
          background-color: #509;
        }

        Label,
        input {
          padding: 5px 5px 5px 10px;
        }

        H1,
        label {
          color: #fff;
        }

        input {
          outline: none;
          background-color: #509;

          font-style: italic;

          color: #f0f;

          border: none;

          border-bottom: 1px solid #f0f;
          animation: rotate 5s ease-in-out 0.5s alternate, move 5s linear 2s;
        }
        input:focus {
          border-bottom: 4px solid #f00;
          font-size: 20px;
          transition: 0.4s ease-out;

          transition-delay: 0.5s;
        }

        H1,
        Form {
          text-align: center;
        }

        input[type="submit"] {
          background-color: #f0f;

          border: none;

          color: #fff;

          margin-top: 20px;
        }
        @keyframes rotate {
          20% {
            transform: rotateY(30deg);
            letter-spacing: 15px;
          }

          40% {
            transform: rotateY(60deg);
            letter-spacing: 10px;
          }

          60% {
            transform: rotateY(90deg);
            letter-spacing: 5px;
          }

          80% {
            transform: rotateY(180deg);
            leter-spacing: 3px;
          }
        }

    </style>
</head>

<body>
        <!DOCTYPE html>

        <html>

        <head>

          <title>Registration</title>

        </head>

        <body>

          <h1>Registration</h1>

          <form name="reg">

            <label for="login">User login</label><br />

            <input name="login" id="login" type="login" placeholder="login"><br />

            <label for="password">User password</label><br />

            <input name="password" id="password" type="password" placeholder="password"><br />

            <label for="email">Email</label><br />

            <input name="email" id="email" type="email" placeholder="email"><br />

            <label for="fname">First Name</label><br />

            <input name="fname" id="fname" type="text" placeholder="First Name"><br />

            <label for="sname">Second Name</label><br />

            <input name="sname" id="sname" type="text" placeholder="Second Name"> <br />

            <input type="submit" onclick="registr()">

          </form>

        </body>

        </html>
    <script>
            function registr() {
              if (
                document.reg.login.value != "" &&
                document.reg.password.value != "" &&
                document.reg.email.value != "" &&
                document.reg.sname.value != "" &&
                document.reg.fname.value != ""
              )
                alert("yes registration");
            }


    </script>
</body>


</html>