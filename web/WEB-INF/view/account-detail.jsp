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
<%@ include file="header.jsp" %>
<body class="grey-bg">
<head>
    <%@ include file="nav-bar.jsp" %>
    <%@ page isELIgnored="false" %>
</head>
<main>

    <div class="row">
        <h1>Dashboard</h1>
        <a href="/test">Go back to homepage</a>
        <a href="/user/logout">Log out</a>
        <div class="news-feed">
            <h2>News</h2>
            <h1>${item}</h1>
            <div class="news-block">
                <h3>title of news item</h3>
                <p class="date"><em>26-07-2018, Nijmegen</em></p>
                <p class="news-text" id="news-item-1">
                    Some kick ass text here, hoping that it will be long enough te fill the block en test if it works on
                    two news items. i think it does, wanna know why?. Because i'm kick ass awesome that's why!. soo lets
                    continue with this text just for the fun of it.
                </p>
            </div>
            <%--<div class="news-block">--%>
                <%--<h3>title of news item</h3>--%>
                <%--<p class="date"><em>26-07-2018, Nijmegen</em></p>--%>
                <%--<p class="news-text" id="news-item-2">--%>
                    <%--Some kick ass text here, hoping that it will be long enough te fill the block en test if it works on--%>
                    <%--two news items. i think it does, wanna know why?. Because i'm kick ass awesome that's why!. soo lets--%>
                    <%--continue with this text just for the fun of it.--%>
                <%--</p>--%>
            <%--</div>--%>
            <%--<div class="news-block">--%>
                <%--<h3>title of news item</h3>--%>
                <%--<p class="date"><em>26-07-2018, Nijmegen</em></p>--%>
                <%--<p class="news-text" id="news-item-3">--%>
                    <%--Some kick ass text here, hoping that it will be long enough te fill the block en test if it works on--%>
                    <%--two news items. i think it does, wanna know why?. Because i'm kick ass awesome that's why!. soo lets--%>
                    <%--continue with this text just for the fun of it.--%>
                <%--</p>--%>
            <%--</div>--%>
        </div>
    </div>
</main>
</body>
<script src="${pageContext.request.contextPath}/resources/js/backendApp.js"></script>
</html>
