<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/2/2022
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      * {
        margin-bottom: 10px;
      }
    </style>
  </head>
  <body>
  <form action="/convert" method="post">
    <input type="text" name="usd"> USD <br>
    <button>Convert</button>
  </form>
  <label>Result: ${vnd} </label>
  </body>
</html>
