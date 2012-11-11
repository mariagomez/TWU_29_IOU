<!DOCTYPE html>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html" charset="UTF-8">
<html lang="en">
<head>
    <title> IOU </title>
    <script type="text/javascript" language="JavaScript">
        window.onload = initReload;
        function initReload() {
            if (window.history.forward() == "http://localhost:9130/twu/dashboard")
                window.location.href = "http://localhost:9130/twu/dashboard";
        }
    </script>
    <link href="static/css/bootstrap.css" rel="stylesheet">
    <link href="static/css/default.css" rel="stylesheet">

</head>

<body>
<div class="container">
    <div class="login-form">
        <h2>Login</h2>

        <form action="checkLogin" method="post" id="loginForm">
            <fieldset>
                Please fill out the following form with your login credentials:
                <label for="email"></label>
                <input type="text" placeholder="Email" id="email" name="email"/>
                <label for="password"></label>
                <input type="password" placeholder="Password" id="password"
                       name="password"/>

                <div class="clearfix">
                    <input class="btn btn-primary" type="submit" value="Login">
                </div>
                Not have an account yet?
                <div class="clearfix">
                    <input class="btn btn-primary" type="button" name="goToCreateAccountButton"
                           id="goToCreateAccountButton"
                           value="Create Account"
                           onclick="javascript:window.location.href='http://localhost:9130/twu/createAccount'"/>
                </div>
            </fieldset>
        </form>
    </div>
</div>
<!-- /container -->
</body>

</html>
