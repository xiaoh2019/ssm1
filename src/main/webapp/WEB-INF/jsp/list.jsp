<%--
  Created by IntelliJ IDEA.
  User: 肖晖
  Date: 2019/6/13
  Time: 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta content="text/html;charset=utf-8" http-equiv="Content-Type">
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>ID</th>
            <th>姓名</th>
            <th>性别</th>
            <th>邮箱</th>
        </tr>

            <c:forEach items="${emps}" var="emp">
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.lastName}</td>
                    <td>${emp.gender==1?男:女}</td>
                    <td>${emp.email}</td>
                </tr>
            </c:forEach>


    </table>
</body>
</html>
