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
<body>
<head>
    <%@ include file="nav-bar.jsp" %>
</head>
<main>
    <div class="row">
        <div class="account-title">
            <h1>Login to get acces to cool features!</h1>
        </div>
        <div class="form-container">
            <div id="reg">
                <h2>Register</h2>
                <div class="form-position">
                    <form:form action="/user/register" modelAttribute="user" method="post">
                        <div>
                            <form:input path="username" class="form-input" placeholder="Enter desired username"/>
                        </div>
                        <div>
                            <form:password path="password" class="form-input" placeholder="Gimme a password"/>
                        </div>
                        <div>
                            <form:input path="email" class="form-input" placeholder="Please enter your email"/>
                            <form:errors path="email" class="form-input"/>
                        </div>
                        <div>
                            <form:select path="country" class="form-dropdown">
                                <form:option value="Netherlands" label="Netherlands"/>
                                <form:option value="America" label="America"/>
                                <form:option value="France" label="France"/>
                                <form:option value="Japan" label="Japan"/>
                            </form:select>
                        </div>
                        <div>
                            <button type="submit" class="reg-btn">Register</button>
                        </div>
                    </form:form>
                </div>
            </div>
            <div id="log">
                <h2>Login</h2>
                <div class="form-position">
                    <form:form action="/user/login" modelAttribute="user" method="post">
                        <div>
                            <form:input path="username" class="form-input" placeholder="Enter your username"/>
                        </div>
                        <div>
                            <form:password path="password" class="form-input" placeholder="Enter your password here"/>
                        </div>
                        <div>
                            <button type="submit" class="reg-btn">Login</button>
                        </div>
                    </form:form>
                </div>
            </div>

            <div class="slider">
                <div id="container">
                    <div class="inner-container">
                        <div class="toggle">
                            <p>Login</p>
                        </div>
                        <div class="toggle">
                            <p>Register</p>
                        </div>
                    </div>
                    <div class="inner-container" id='toggle-container'>
                        <div class="toggle">
                            <p>Login</p>
                        </div>
                        <div class="toggle">
                            <p>Register</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
</body>
<script src="${pageContext.request.contextPath}/resources/js/Account.js"></script>
</html>
