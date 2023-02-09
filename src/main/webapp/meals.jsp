<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.02.2023
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="ru">
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Meals</h2>
<table border="2">
    <tr>
        <th>Date</th>
        <th>Description</th>
        <th>Calories</th>
        <th></th>
        <th></th>
    </tr>

    <c:forEach var="mealTo" items="${mealToList}">
        <c:choose>
            <c:when test="${mealTo.excess}">
                <tr style="color: red">
            </c:when>
            <c:otherwise>
                <tr style="color: green">
            </c:otherwise>
        </c:choose>
        <td>${mealTo.dateTime}</td>
        <td>${mealTo.description}</td>
        <td>${mealTo.calories}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>