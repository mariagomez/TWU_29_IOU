<form action="checkLogin" method="post" id="loginForm">
    <label for="email">E-mail</label> <input type="text" id ="email" name="email"/> <br/>
    <label for="password">Password</label> <input type="password" id ="password" name="password"/>  <br/>
    <input type="submit" value="Login"> <br/>
    <input type="button" name="goToCreateAccountButton" id="goToCreateAccountButton" value="Create Account" onclick="javascript:window.location.href='http://localhost:9130/twu/createAccount'"/>
</form>