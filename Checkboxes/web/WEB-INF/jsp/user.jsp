<%--
  如果在JSP文件中使用<form:form>标签，spring框架需要一个名称为“command”的对象。
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Spring MVC表单处理(文本域)</title>
</head>
<body>
    <h2>用户信息</h2>
    <form:form method="POST" action="/addUser">
        <table>
            <tr>
                <td><form:label path="username">用户名：</form:label></td>
                <td><form:input path="username" /></td>
            </tr>
            <tr>
                <td><form:label path="password">密码：</form:label></td>
                <td><form:password path="password" /></td>
            </tr>
            <tr>
                <td><form:label path="address">地址：</form:label></td>
                <td><form:textarea path="address" rows="5" cols="30" /></td>
            </tr>
            <tr>
                <td><form:label path="receivePaper">订阅新闻？</form:label></td>
                <td><form:checkbox path="receivePaper" /></td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value="提交"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
<%--<form:checkbox path="receivePaper" />将呈现以下HTML内容。
<form:checkboxes items="${webFrameworkList}" path="favoriteFrameworks" />--%>