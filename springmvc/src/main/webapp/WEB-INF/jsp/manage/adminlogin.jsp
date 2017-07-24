<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台登录</title>
</head>
<body>
	<h2>后台管理员登录</h2>
	<form action="${pageContext.request.contextPath }/manage/admin/loginCheck" method="POST">
		<p>账号：<input type="text" name="loginId"></p>
		<p>密码：<input type="password" name="loginPsw"></p>
		<p><input type="submit" value="登录"> <label style="color:red;font-family: 微软雅黑;font-size:small;">${ tip }</label> </p>
	</form>
</body>
</html>