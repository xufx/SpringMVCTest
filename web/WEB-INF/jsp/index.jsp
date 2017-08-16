<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring Landing Page</title>
</head>
<body>
<h2>Spring Landing Page</h2>
<p>点击下面的按钮获得一个简单的HTML页面</p>
<form:form method="GET" action="/redirect">
    <table>
        <tr>
            <td>
                <input type="submit" value="页面重定向"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
