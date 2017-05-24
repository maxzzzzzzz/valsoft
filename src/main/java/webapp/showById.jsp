<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 19.05.2017
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show By Id</title>
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
            <tr>
                <td>${BUS.name}</td>
                <td>${BUS.speed}</td>
                <td>${BUS.weight}</td>
                <td>${BUS.numberOfPassengers}</td>
                <td>${BUS.numberOfWheels}</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
