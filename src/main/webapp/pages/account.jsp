<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="_header.jsp"/>
<html>
<head>
    <title>Account</title>
</head>
<body>
<div class="container">
    <p>Account</p>
    <br>
    <p>Hello ${sessionScope.user.name}!</p>
    <br>
    <a class="btn btn-primary" href="/basket" role="button">My basket</a>

<%--<ul class="list-group">
        <c:forEach items="${sessionScope.basket.getAll()}" var="book">
            <li class="list-group-item">${book.name}</li>
        </c:forEach>
    </ul>--%>
</div>
</body>
</html>