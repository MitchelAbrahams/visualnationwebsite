<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mitchel
  Date: 6-7-2018
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <link href="${pageContext.request.contextPath}/resources/css/normilize.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
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
        <h1>Hello: ${user.username} with email: ${user.email} from: ${user.country}</h1>
        <form:form action="register" modelAttribute="user">

                <form:input path="username" />
        <br><br>
                <form:input path="email" />
                <form:errors path="email" />
        <br><br>
                <input type="submit" value="submit" />
            <br><br>
                <form:select path="country">
                    <form:option value="Netherlands" label="Netherlands"/>
                    <form:option value="America" label="America"/>
                    <form:option value="France" label="France"/>
                    <form:option value="Japan" label="Japan"/>
                </form:select>
        </form:form>
    </div>
</main>
</body>
</html>
