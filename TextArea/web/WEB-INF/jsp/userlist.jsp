<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2>提交的用户信息</h2>
<table>
    <%--<tr>
        <td>用户名：</td>
        <td>${username}</td>
    </tr>
    <tr>
        <td>密码：</td>
        <td>${password}</td>
    </tr>--%>
        <tr>
            <td>用户名：</td>
            <td>${SpringWeb.username}</td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>${SpringWeb.password}</td>
        </tr>
</table>
</body>
</html>
