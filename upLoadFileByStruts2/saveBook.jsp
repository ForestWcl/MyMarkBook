<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>保存图书</title>
</head>
<body>
	<s:form action="saveBook" enctype="multipart/form-data">
		<s:textfield label="书名" name="book.title" />
		<s:textfield label="作者" name="book.author" />
		<s:textfield label="价钱" name="book.price" />
		<s:textfield label="出版社" name="book.publisher" />
		<s:textfield label="录入时间" name="book.saveDate" />
		<s:file label="封面图" name="file"/>
		<s:submit value="录入"/>
	</s:form>
</body>
</html>
