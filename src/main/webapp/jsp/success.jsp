<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file='../jsp/head.jsp' %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="static/style/main.css"/>
<title>Search sudents</title>
<body>
	<p>Search sudents</p>
	<form action="StudentServlet" method="post">
		<input type="text" name="name">
		<input type="submit" value="Search">
	</form>

		<table align="center">
			<thead>
				<tr>
					<th>Id</th>
					<th>Имя</th>
					<th>Возраст</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="student">
					<tr>
						<td><c:out value="${student.id}" /></td>
						<td><c:out value="${student.name}" /></td>
						<td><c:out value="${student.age}" /></td>
					</tr>
				</c:forEach>
				<c:if test="${empty students}">
					<td colspan="6">Данных нет.</td>
				</c:if>
			</tbody>
		</table>
		<c:url var="addUrl" value="pageadd" />
		<a href="${addUrl}" class="btn btn1">Добавить</a>
</body>
<%@include file='../jsp/footer.jsp' %>
