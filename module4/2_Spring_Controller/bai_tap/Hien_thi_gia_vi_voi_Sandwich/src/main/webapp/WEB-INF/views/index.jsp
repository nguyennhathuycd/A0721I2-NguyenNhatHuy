<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/2/2022
  Time: 12:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sandwich</title>
  </head>
  <body>
  <h3>Sandwich condiments</h3>
  <form action="/save" method="post">
    <input type="checkbox" id="Lettuce" name="condiment" value="Lettuce">
    <label for="Lettuce">Lettuce</label><br>
    <input type="checkbox" id="Tomato" name="condiment" value="Tomato">
    <label for="Tomato">Tomato</label><br>
    <input type="checkbox" id="Mustard" name="condiment" value="Mustard">
    <label for="Mustard">Mustard</label><br>
    <input type="checkbox" id="Sprouts" name="condiment" value="Sprouts">
    <label for="Sprouts">Sprouts</label><br>
    <button type="submit">Save</button>
  </form>
  </body>
</html>
