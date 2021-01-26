<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>

<jsp:include page="_header.jsp"/>
<jsp:include page="bookView.jsp"/>
<div class="container">
    <ul>
        <%--<c:forEach items="${requestScope.book}" var="book">
            <li><a href="/book/view?id=${book.id}">${book.name}</a></li>
        </c:forEach>--%>
    </ul>
</div>
</body>
</html>