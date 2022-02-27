<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/2/2022
  Time: 12:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
    <c:choose>
        <c:when test="${condiments != null}">
            <label>List Sandwich condiments:</label>
            <br>
            <c:forEach var="condiment" items="${condiments}">
                <label>${condiment}</label>
                <br>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <label>No condiments to choose</label>
        </c:otherwise>
    </c:choose>
</body>
</html>
