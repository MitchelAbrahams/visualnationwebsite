<%--
  Created by IntelliJ IDEA.
  User: mitchel
  Date: 6-7-2018
  Time: 11:47
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
    <%--<link rel="stylesheet" href="css/normalize.css">--%>
    <link rel="stylesheet" href="css/main.css">
    <!-- volgorde stylesheets: zoals in een stylesheet worden de stylesheets zelf ook volgorde geladen en de laatste heeft dus altijd voorrang, daar zet je dus altijd je eigen stylesheet zodat je alles kunt overriden. Het je meerdere eigen stylesheets, dan zet je ze op specificiteit  -->
</head>
<body>
<head>
    <div class="quote-bg">
        <nav class="nav-bar">
            <div class="row">
                <ul>
                    <li><a href="#">menu item</a></li>
                    <li><a href="#">menu item</a></li>
                    <li><a href="#">menu item</a></li>
                    <li><a href="#">menu item</a></li>
                    <li><a href="#">menu item</a></li>
                    <li><a href="/pages"><span class="material-icons">person</span></a></li>
                </ul>
            </div>
        </nav>
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
        <div class="budget-bottom">
            <div class="income">
                <h2 class="income-title">Income</h2>
                <div class="income-list">
                    <%--<div class="list-container" id="income-0">--%>
                        <%--<div class="item-description">Salary</div>--%>
                        <%--<div class="item-value">+ 2,100.00</div>--%>
                        <%--<div class="item-delete"><button class="del-btn"><span class="material-icons">delete</span></button></div>--%>
                    <%--</div>--%>
                    <%--<div class="list-container" id="income-1">--%>
                        <%--<div class="item-description">Salary</div>--%>
                        <%--<div class="item-value">+ 2,100.00</div>--%>
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
                    <%--<div class="list-container" id="expense-1">--%>
                        <%--<div class="item-description">Apartment rent</div>--%>
                        <%--<div class="item-value">- 900.00</div>--%>
                    <%--</div>--%>
                </div>
            </div>
        </div>
    </div>
</head>
</body>
<script src="js/qouteGen.js"></script>
<script src="js/budgetizeApp.js"></script>
</html>
