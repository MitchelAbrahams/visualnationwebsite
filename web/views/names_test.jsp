<%--
  Created by IntelliJ IDEA.
  User: mitchel
  Date: 5-7-2018
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<p>something here bruh</p>

<c:forEach var="tempStudent" items="${requestScope.student_list}">

    <p>${tempStudent}</p>


</c:forEach>

</body>
</html>
