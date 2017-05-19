<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 19.05.2017
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
    <script src="/js/JQuery.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/bootstrap.js"></script>
</head>
<body>
<form>
    <div class="container">
        <button formaction="/serv/add" formmethod="POST">To ADD</button>
        <button formaction="/serv/showAll" formmethod="POST">To ShowALL</button>
    </div>
</form>
</body>
</html>
