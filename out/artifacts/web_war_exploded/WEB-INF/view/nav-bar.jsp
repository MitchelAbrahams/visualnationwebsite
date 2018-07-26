<nav class="nav-bar">
    <div class="row">
        <ul>
            <li><a href="#">menu item</a></li>
            <li><a href="#">menu item</a></li>
            <li><a href="#">menu item</a></li>
            <li><a href="#">menu item</a></li>
            <li><a href="#">menu item</a></li>
            <c:choose>
                <c:when test="${userID == null}">
                    <li><a href="/user/account"><span class="material-icons">person</span></a><p><c:out value="${username}"></c:out></p></li>
                </c:when>
                <c:otherwise>
                    <li><a href="/backend/dashboard"><span class="material-icons">person</span></a><p><c:out value="${username}"></c:out></p></li>
                </c:otherwise>
            </c:choose>

        </ul>
    </div>
</nav>
