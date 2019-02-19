<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/12/23
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<form action="sver?type=insert" method="post">
    <table border="1">
    <tr>
        <td>会议室预定</td>
        <td>会议室<select name="uid" id="uid">
            <option value="0">一号会议室</option>
            <option value="1">二号会议室</option>
            <option value="2">三号会议室</option>
        </select>
        </td>
        <td>申请人<input type="text" name="nameid" id="nameid"/></td>
        <td>预定日期<input type="text" name="ushijian" id="ushijian">日期格式yyy-mmm-ddd</td>
        <td><input type="submit"  value="申请" id="shenqing" >
            <input type="button" value="重置"></td>
    </tr>
</table>
</form>

</body>
</html>
<script src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
    $(function () {
        $("#shenqing").click(function () {
            var ciud=$("#uid").val();
            var uname=$("#nameid").val();
            var ushijian=$("#ushijian").val();
            if(ciud=="" || uname=="" || ushijian==""){
                alert("不能为空")
                return false;
            }
            var asd=/^\d{4}(\-|\/|\.)\d{1,2}\1\d{1,2}$/;
            if(!asd.test(ushijian)){
                alert("格式不对")
                return false
            }

            return true;
        })

    });
</script>