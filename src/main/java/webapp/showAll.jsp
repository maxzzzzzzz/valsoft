<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 19.05.2017
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show ALL</title>
    <script src="/js/JQuery.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/bootstrap.js"></script>
</head>
<body>
<div class="container">
    <div>
        <table id="myTable" class="table">
            <thead class="thead thead-default">
            <tr>
                <th>Name</th>
                <th>Speed</th>
                <th>Weight</th>
                <th>Number Of Passengers</th>
                <th>Number Of Wheels</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${BUSES}" var="BUS">
                <tr>
                    <td>${BUS.name}</td>
                    <td>${BUS.speed}</td>
                    <td>${BUS.weight}</td>
                    <td>${BUS.numberOfPassengers}</td>
                    <td>${BUS.numberOfWheels}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>


</body>
</html>
