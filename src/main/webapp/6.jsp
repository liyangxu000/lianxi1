<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/1/23
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="select?type=insert" method="post">
<table border="1">

        <tr>
            <td colspan="2" style="text-align: center">考勤记录信息表</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="uname" id="uname"></td>
        </tr>
        <tr>
            <td>所属部门</td>
            <td><input type="text" name="bumen" id="bumen"></td>
        </tr>
        <tr>
            <td>考勤日期</td>
            <td><input type="text" name="riqi" id="riqi">日期格式：yyy-mm-dd</td>
        </tr>
        <tr>
            <td>考勤状态</td>
            <td><select id="mid" name="mid">
                <option value="0">请选择考勤类型</option>
                <option value="1">正常</option>
                <option value="2">迟到</option>
                <option value="3">早退</option>
                <option value="4">休假</option>
                <option value="5">外出</option>
            </select></td>
        </tr>
        <tr>
            <td><input type="submit" value="登记" id="tijiao"></td>
            <td><input type="submit" value="重置"></td>
        </tr>
</table>
</form>
</body>
</html>
<script src="js/jquery-1.12.4.js" type="text/javascript"></script>
<script type="text/javascript">

   $(function () {
       var xing=$("#uname").val();
       var bumen=$("#bumen").val();
       var riqi=$("#riqi").val();
       var tai=$("#mid").val();
       $("#tijiao").click(function () {

      var qi=/^\d{4}(\-|\/|\.)\d{1,2}\1\d{1,2}$/;
      if(!qi.test(riqi)){
          alert("日期格式必须是yyy-mm-dd格式,请检查后重新输入");
          return false;
      }
      return true;
       })
   })
</script>
