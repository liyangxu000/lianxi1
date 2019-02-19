<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>预定编号</td>
        <td>会议室</td>
        <td>日期</td>
        <td>预订人</td>
    </tr>
    <c:forEach items="${list}" var="ps">
        <tr>
            <td>${ps.id}</td>
            <td>${ps.name}</td>
            <td>${ps.order}</td>
            <td>${ps.uname}</td>
        </tr>
    </c:forEach>
</table>
<a href="2.jsp">预定会议室</a>

</body>
</html>
