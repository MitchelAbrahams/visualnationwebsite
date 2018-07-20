<%-- Created by IntelliJ IDEA. --%>
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