<%--
  Created by IntelliJ IDEA.
  User: mitchel
  Date: 6-7-2018
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<body>
<head>
    <div class="quote-bg">
        <%@ include file="nav-bar.jsp" %>
        <div class="inst-cont">
            <h1>Free Instructions Generator</h1>
            <h3>Get to know how this site works!</h3>
            <h3>By clicking on the button below!</h3>
            <div class="instruction-text" id="instruction-text">
                <h2 class="instructions" id="instructions"></h2>
            </div>
            <button class="button">Click here</button>
        </div>
    </div>
    <div class="budget-app-bg">
        <div class="budget-top">
            <h1>Budgetize</h1>
            <p>Loot this month</p>
            <h2 class="total-income" id="total-income"> + 1234.95</h2>
            <div class="inc">
                <p>Income</p>
                <h4 id="income">+1234.95</h4>
            </div>
            <div class="exp">
                <p>Expenses</p>
                <h4 id="expenses">-1234.95</h4>
            </div>
        </div>
        <div class="budget-middle">
            <div class="input-fields">
                <select class="add-type">
                    <option value="inc" selected>+</option>
                    <option value="exp">-</option>
                </select>
                <input type="text" class="add-description" placeholder="Add description">
                <input type="number" class="add-value" placeholder="Value">
                <button class="add-btn">add</button>
            </div>
        </div>
        <div class="container">
            <div class="budget-bottom">
                <div class="income">
                    <h2 class="income-title">Income</h2>
                    <div class="income-list">
                        <%--<div class="list-container" id="income-0">--%>
                            <%--<div class="item-description">Salary</div>--%>
                            <%--<div class="item-value">+ 2,100.00</div>--%>
                            <%--<div class="item-delete"><button class="del-btn"><span class="material-icons">delete</span></button></div>--%>
                        <%--</div>--%>
                    </div>
                </div>
                <div class="expenses">
                    <h2 class="expenses-title">Expenses</h2>
                    <div class="expenses-list">
                        <%--<div class="list-container" id="expense-0">--%>
                            <%--<div class="item-description">Apartment rent</div>--%>
                            <%--<div class="item-value">- 900.00</div>--%>
                        <%--</div>--%>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="cs-bg">
        <h1>Next app is coming soon</h1>
    </div>
</head>
</body>
<script src="${pageContext.request.contextPath}/resources/js/qouteGen.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/budgetizeApp.js"></script>
</html>
