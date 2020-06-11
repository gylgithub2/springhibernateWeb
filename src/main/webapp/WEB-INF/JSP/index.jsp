<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!--格式化库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!--jstl函数库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>

<body>

	<table>
		<tr>
			<td>id</td>
			<td>用户</td>
			<td>余额</td>
		</tr>
		<c:forEach var="user" items="${users }">
		<tr>
			<td>${user.id }</td>
			<td>${user.userName }</td>
			<td>${user.balance }</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>