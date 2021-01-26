<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<div class="row">
    <c:forEach items="${requestScope.book}" var="book">
        <div class="col-sm-2">
            <div class="card" style="width: 15rem;">
                <img src="${book.url}" class="card-img-top"
                     alt="...">
                <div class="card-body">
                    <p>${book.name}</p>
                    <p>${book.price}</p>
                    <form method="post" action="/myBooks">
                        <input type="hidden" name="id" value="${book.id}">
                        <button class="btn btn-primary" type="submit">Add to basket</button>
                    </form>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>