<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mitchel
  Date: 6-7-2018
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="nl">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Visual Nation</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"> <!-- deze tag zorgt ervoor dat de browser weet dat je een responsive website wilt laten zien die geen rare zoom dingen doet in formulieren e.d. -->

    <link rel="manifest" href="site.webmanifest"> <!-- deze en de volgende tag zijn voor de favicon (dat kleine icoontje in je browser) en voor de icoontjes op het home screen van je device -->
    <link rel="apple-touch-icon" href="icon.png">
    <!-- Place favicon.ico in the root directory -->


    <link href="https://fonts.googleapis.com/css?family=Lato:300,300i,400,400i,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Dawning+of+a+New+Day" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/main.css">
    <!-- volgorde stylesheets: zoals in een stylesheet worden de stylesheets zelf ook volgorde geladen en de laatste heeft dus altijd voorrang, daar zet je dus altijd je eigen stylesheet zodat je alles kunt overriden. Het je meerdere eigen stylesheets, dan zet je ze op specificiteit  -->
</head>
<body>
<head>
    <nav class="nav-bar">
        <div class="row">
            <ul>
                <li><a href="#">menu item</a></li>
                <li><a href="#">menu item</a></li>
                <li><a href="#">menu item</a></li>
                <li><a href="#">menu item</a></li>
                <li><a href="#">menu item</a></li>
                <li><a href="#"><span class="material-icons">person</span></a></li>
            </ul>
        </div>
    </nav>
</head>
<main>
    <div class="row">
        <c:forEach var="error" items="${registerErr}">
            <h1>${error}</h1>
        </c:forEach>
        <h1></h1>
        <form action="/register" method="post">
            <div class="col-1-3 inline-label">
                <label for="username">Email</label>
            </div>
            <div class="col-2-3">
                <input type="text" class="input-user" name="username" autocomplete="username" required id="username" placeholder="choose your username">
            </div>
            <div class="col-1-3 inline-label">
                <label for="email">Email</label>
            </div>
            <div class="col-2-3">
                <input type="email" class="input-user" name="email" autocomplete="email" required id="email" placeholder="Your email address">
            </div>
            <div class="col-1-3 inline-label">
                <label for="password">Password</label>
            </div>
            <div class="col-2-3">
                <input type="password" class="input-user" name="password" id="password" required placeholder="Your password">
            </div>
            <div class="col-3-3">
                <button type="submit"><span class="material-icons">check</span> Sign in</button>
            </div>
        </form>
    </div>
</main>
</body>
</html>
