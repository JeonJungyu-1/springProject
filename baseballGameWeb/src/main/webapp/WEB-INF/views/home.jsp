<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="/resources/fonts/icomoon/style.css">

    <link rel="stylesheet" href="/resources/css/owl.carousel.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    
    <!-- Style -->
    <link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript">
function joinForm() {
	location.href="/member/joinForm";
}
function loginForm() {
	location.href="/member/loginForm";
}
function logout() {
	location.href="/member/logout";
}
function rank() {
	location.href="/rank";
}
function hof() {
	location.href="/hof";
}
function characterMenu() {
	location.href="/member/characterMenu";
}
</script>	
</head>
<body>
<div class="content">
    
    <div class="container">
<h2 class="mb-5">
	[ 야구선수 키우기 ]  
</h2>

<c:if test="${not empty sessionScope.loginId }">
<h2>
	${sessionScope.loginNm }(${sessionScope.loginId })님 환영합니다 !!!
</h2>
</c:if>

<c:choose>
	<c:when test="${empty sessionScope.loginId }">
		<button class="menu" onclick="joinForm()">회원가입</button><br><br>
		<button class="menu" onclick="loginForm()">로그인</button><br><br>
	</c:when>
	<c:otherwise>
		<button class="menu" onclick="logout()">로그아웃</button><br><br>
		<button class="menu" onclick="characterMenu()">캐릭터메뉴</button><br><br>
	</c:otherwise>	
</c:choose>
<button class="menu" onclick="rank()">순위</button><br><br>
<button class="menu" onclick="hof()">명예의 전당</button>
</div>
</div>
	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>

</body>
</html>
