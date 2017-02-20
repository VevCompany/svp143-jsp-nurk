<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file='../jsp/head.jsp' %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search sudents</title>
<body>
	<p>Search sudents</p>
	<form action="StudentServlet" method="post">
		<input type="text" name="name">
		<input type="submit" value="Search">
	</form>
</body>
<%@include file='../jsp/footer.jsp' %>