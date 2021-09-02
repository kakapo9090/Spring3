<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
	<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
	<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>List Renewal</h1>
	
	<div class="container-fluid">
		<div class="col-md-8 mx-auto my-auto">
		<table class="table table-dark table-hover">
			<tr>
				<th>Number</th><th>Name</th><th>Rate</th>
			</tr>
		<c:forEach items="${list }" var="dto"> <!-- 북넘버컨트롤러의 애드오브젝트 "list" -->
			<tr>
				<td>${dto.bookNumber}</td>
				<td><a href="./bankbookSelect?bookNumber=${dto.bookNumber}">${dto.bookName}</a></td>
				<td>${dto.bookRate}</td>
			</tr>	
		</c:forEach>
		</div>
		</table>
		
		<a href="./bankbookInsert" class="btn btn-danger">ADD</a>
</body>
</html>