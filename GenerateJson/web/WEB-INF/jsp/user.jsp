<%--
  如果在JSP文件中使用<form:form>标签，spring框架需要一个名称为“command”的对象。
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC表单处理(文本域)</title>
</head>
<body>
    <h2>用户信息</h2>
    ${requestScope.user.name}
</body>
</html>
<%--<form:textarea将呈现以下HTML内容。
<textarea id="address" name="address" rows="5" cols="30">--%>