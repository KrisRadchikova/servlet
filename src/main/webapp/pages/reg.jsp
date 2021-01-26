<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <style>
        #exampleInputEmail1, #exampleInputEmail2,
        #exampleInputPassword1, #question
        {
            width: 500px;
        }
    </style>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container">
    <form action="/reg" method="post">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Name</label>
            <input type="text" value="${requestScope.oldName}" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail2" class="form-label">Login</label>
            <input type="text" value="${requestScope.oldLogin}" name="login" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text">${requestScope.messageUser}</div>
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" value="${requestScope.oldPassword}" name="password" class="form-control" id="exampleInputPassword1">
            <div class="form-text">${requestScope.messagePassword}</div>

        </div>
       <%-- <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Question</label>
            <input type="text" value="${requestScope.question}" name="question" class="form-control" id="question">
        </div>--%>

        <button type="submit" class="btn btn-success">Registration</button>
    </form>
</div>
<%--
<a href="/" class="btn">Back</a>
--%>
</body>
</html>
