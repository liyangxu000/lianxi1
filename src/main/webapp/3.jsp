<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post">

    <table border="1">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>家庭住址</td>
            <td>电子邮件</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="re">
            <tr>
                <td>${re.mid}</td>
                <td>${re.mname}</td>
                <td>${re.mgender}</td>
                <td>${re.mage}</td>
                <td>${re.maddress}</td>
                <td>${re.memail}</td>
                <td><a href="sver?type=selectapp&id=${re.mid}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>
<script src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">

</script>
