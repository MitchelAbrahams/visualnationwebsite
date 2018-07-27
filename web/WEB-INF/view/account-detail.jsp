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
        <%--<a href="/test">Go back to homepage</a>--%>
        <%--<a href="/user/logout">Log out</a>--%>

        <%--##############################  NEWS BLOCK  #####################################--%>
        <div class="news-feed">
            <h2>News</h2>
            <c:forEach begin="0" end="${item.size() - 1}" varStatus="loop">
                <div class="news-block">
                <h3>${item.get(loop.index).title}</h3>
                <p class="date"><em>${item.get(loop.index).date}</em></p>
                <p class="news-text" id="news-item-${loop.index}">
                ${item.get(loop.index).item}
                </p>
                </div>
            </c:forEach>
        </div>
        <%--##############################  NEWS BLOCK  #####################################--%>
        <div class="flex-small-block">
            <div class="small-dash-block">
                <div class="small-dash-title">
                    <h2>title here</h2>
                </div>

            </div>
            <div class="small-dash-block">

            </div>
            <div class="small-dash-block">

            </div>
            <div class="small-dash-block">

            </div>
        </div>
    </div>
</main>
</body>
<script src="${pageContext.request.contextPath}/resources/js/backendApp.js"></script>
</html>
