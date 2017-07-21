<%@page import="sample.s2.util.StudentConverter"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>图书管理</title>
</head>
<body>
	<h2>后台管理</h2>
	
	<ul>
		<li><a href="<s:url value="/manage/userHome" />">个人中心</a></li>
		<li><a href="/DemoStruts2/manage/bookMgr">图书管理</a></li>
	</ul>
	
	<s:if test="#session.user != null">
		<p>您好，${ user.name }，您已登录后台！<a href="/DemoStruts2/manage/userLogout">注销</a></p>
	</s:if>
	<s:else>
		<p>非法操作</p>
	</s:else>
	
	<p>
		<a href="/DemoStruts2/tongxunlu.xlsx">下载员工通讯录</a>
		<a href="/DemoStruts2/manage/downloadFGT">下载风景图片</a>
		${ downloadTip }
	</p>
	
	<s:debug></s:debug>
	
	<h3>图书信息列表（图书本书：${ books.size() }）</h3>		
	<table id="book-list" border="1">
		<tr>
			<td width="150">图书</td>
			<td width="100">价格</td>
			<td width="100">分类</td>
		</tr>	
	</table>
	<h3>录入新图书信息</h3>
	<form action="/DemoStruts2/manage/bookSave" method="POST" enctype="multipart/form-data">
		<p>书名：<input type="text" name="book.title"> <span id="tipBookTitle"></span></p>
		<p>作者：<input type="text" name="book.author"></p>
		<p>价格：<input type="text" name="book.price"></p>
		<p>分类：<select name="book.category.id">
			<option value="1">小说</option>
			<option value="2">历史</option>
			<option value="3">军事</option>
		</select></p>
		<p>出版社：<input type="text" name="book.publisher"></p>
		<p>图书海报：<input type="file" name="pic"> <s:fielderror fieldName="pic" /></p>
		<p><input type="submit" value="录入"> ${bookSaveTip } <s:actionerror/></p>
	</form>	
	<script type="text/javascript" src="/DemoStruts2/js/jquery-1.12.4.js"></script>
	<script type="text/javascript">
		$(function(){
			loadBooks();
			$("[name='book.title']").on("blur", function(){
				var title = $.trim($(this).val());
				$("#tipBookTitle").html("");
				if(title == "") {
					$("#tipBookTitle").html("书名必填！").css("color", "red");
				} else {
					/*
						3.3.1	后台管理录入新图书信息时，异步检测图书名是否存在的功能实现
						1、前端URL: /DemoStruts2/manage/bookTitleCheck
						2、提交参数：book.title (要检测是否重复的图书名称)
						3、响应结果：canUse (类型：string，值："ok"或者"no", ok代表可用，no代表)					
					
					*/
					$.post("/DemoStruts2/manage/bookTitleCheck", {"book.title": title}, function(canUse){
						if(canUse == "ok") {
							$("#tipBookTitle").html("书名格式正确可用！").css("color", "green");
						} else if(canUse == "no"){
							$("#tipBookTitle").html("书名不可用：已经存在！").css("color", "red");
						} else {
							alert(canUse)
						}
					})
				}
			});
		})		
		
		
		function loadBooks() {
			$.getJSON("/DemoStruts2/manage/bookList", function(bookArr){
				var trs = "";
				for(var i in bookArr) {
					trs += "<tr><td>《" + bookArr[i].title + "》</td>";
					trs += "<td>￥" + bookArr[i].price + "</td>";
					trs += "<td>" + bookArr[i].category.name + "</td></tr>";				
				}
				$("#book-list tr:first").after(trs);
			});
		}
	</script>
</body>
</html>
