<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <table border="1" >

      <form action="sver?type=update" method="post">
          <c:forEach items="${list}" var="list">
          <tr>
              <td>会员信息</td>
              姓名<td><input  type="text" name="uname" id="uname" value="${list.mname}"></td>
              性别<td><input type="text" name="xingbie" id="xingbie" value="${list.mgender}"></td>
              年龄<td><input type="text" name="nian" id="nian"  value="${list.mage}"></td>
              家庭地址<td><input type="text" name="dizhi" id="dizhi"  value="${list.maddress}"></td>
              电子邮箱<td><input type="text" name="you" id="you" value="${list.memail}"></td>
              <td><input type="hidden" name="suid" id="suid" value="${list.mid}"></td>
              <td><input type="submit" value="提交"></td>
              <td><input type="submit" value="重置"></td>
          </tr>
          </c:forEach>
      </form>
  </table>
</body>
</html>
<script src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">

</script>