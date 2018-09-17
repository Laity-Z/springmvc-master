<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/17
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑</title>
</head>
<body>
<form:form action="update" method="post" modelAttribute="admin">
    <form:hidden path="id"/>
    <form:input path="username"/>
    <form:input path="password"/>
    <input type="submit" value="提交更新"/>
</form:form>
</body>
</html>
