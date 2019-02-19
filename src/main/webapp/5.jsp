<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <table border="1">
       <tr>
           <td colspan="4" style="text-align: center">考勤信息表</td>
       </tr>
       <tr>
           <td>员工姓名</td>
           <td>所属部门</td>
           <td>考勤日期</td>
           <td>考勤状态</td>
       </tr>
       <c:forEach items="${list}" var="ps">
           <tr>
               <td>${ps.empname}</td>
               <td>${ps.dept}</td>
               <td>${ps.chkdate}</td>
               <td>${ps.status}</td>
           </tr>
       </c:forEach>
   </table>
<a href="6.jsp">考勤登记</a>
</body>
</html>
