<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/2/2022
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/dictionary" method="post">
    <label>Enter Dictionary: </label>
    <input type="text" name="dictionary">
    <br>
    <button type="submit">Translate</button>
  </form>
  <label>Result: ${result}</label>
  </body>
</html>
