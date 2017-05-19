<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 16.05.2017
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add something</title>
    <script src="/js/JQuery.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/bootstrap.js"></script>

</head>
<body>

<div class="container-fluid ">
    <h1>Add new bus:</h1>
    <div class="col-md-5">
        <form id="addForm" method="get" action="/serv/show">
            <div class="form-group">
                <label for="name">Name: </label>
                <input type="text" name="name" id="name" class="form-control">
            </div>
            <div class="form-group">
                <label for="speed">Speed: </label>
                <input type="text" name="speed" id="speed" class="form-control">
            </div>
            <div class="form-group">
                <label for="weight">Weight: </label>
                <input type="text" name="weight" id="weight" class="form-control">
            </div>
            <div class="form-group">
                <label for="numPass">Number of Passengers: </label>
                <input type="text" name="numPass" id="numPass" class="form-control">
            </div>
            <div class="form-group">
                <label for="numWheels">Number of wheels: </label>
                <input type="text" name="numWheels" id="numWheels" class="form-control">
            </div>

            <button type="submit" class="btn btn-default" id="AddButton">Add</button>

        </form>
    </div>
</div>

</body>
</html>
