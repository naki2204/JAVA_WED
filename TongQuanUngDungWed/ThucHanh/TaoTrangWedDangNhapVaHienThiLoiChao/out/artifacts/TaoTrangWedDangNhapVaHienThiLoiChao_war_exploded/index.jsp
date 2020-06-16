<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/5/2020
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

  <style type="text/css">
    login{
      height: 180px;width: 230px;
      margin: 0px;
      padding: 10px;
      border: 1px #CCC solid;
    }
    login input{
      padding: 10px;
      margin: 50px;
    }
  </style>
  <body>
  <form method="post" action="/login">
    <div class="login">
      <h2>Login</h2>
      <input type="text" name="username"  placeholder="username" />
      <br>
      <input type="password" name="password"  placeholder="password" />
      <br>
      <input type="submit" value="Sign in"/>
    </div>
  </form>
  </body>
</html>
