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
  <h3>Calculator</h3>
  <form id="form" action="/calculator" method="post">
    <input type="text" name="number1">
    <input type="text" name="number2">
    <input type="text" id="action" name="action" hidden>
    <br>
    <button onclick="document.getElementById('action').value='add'" type="submit">Addition(+)</button>
    <button onclick="document.getElementById('action').value='sub'" type="submit">Subtraction(-)</button>
    <button onclick="document.getElementById('action').value='mul'" type="submit">Multiplication(*)</button>
    <button onclick="document.getElementById('action').value='div'" type="submit">Division(/)</button>
  </form>
  </body>
</html>
