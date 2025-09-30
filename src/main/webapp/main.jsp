<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
<!--  로그인 상태라면, 로그아웃 버튼이 나오도록 구현하기 JSTL-->
	<c:if test="${not empty memberEmail}">
		<div>
			<a href="/flow/logout.member">로그아웃</a>
		</div>
	</c:if>
	
	<c:if test="${empty memberEmail}">
		<div>
			<a href="/flow/join.member">회원가입</a>
			<a href="/flow/join.member">로그인</a>
		</div>
	</c:if>
</body>
</html>