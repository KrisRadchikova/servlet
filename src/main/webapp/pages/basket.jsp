<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Basket</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container">
    <form action="/basket" method="post">
    <ul>
        <c:forEach items="${requestScope.book}" var="book">
            <li>${book.name}</li>
        </c:forEach>
    </ul>
    </form>
</div>
</body>
</html>
