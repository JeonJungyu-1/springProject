<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>탑 오르기</title>
<script type="text/javascript">
function joinForm() {
	location.href = "/member/joinForm";
}
function loginForm() {
	location.href = "/member/loginForm";
}
function logout() {
	location.href = "/member/logout";
}
function searchForm() {
	location.href = "/board/searchForm";
}
function towerForm(currentPage) {
	location.href = "/tower/towerForm?currentPage="+currentPage;
}
</script>
<style type="text/css">
	body {
		background-image: url('/resources/images/background/1.jpg');
		background-repeat: no-repeat;
		background-size: cover;
	}
	.home {
		position: absolute;
		top: 50%;
		left: 50%;
		transform: translate(-50%, -50%);
	}
	
</style>

</head>
<body>
<div class="home">
	<h1>메인 메뉴</h1>
	<c:choose>
		<c:when test="${empty sessionScope.loginId }">
			<input type="button" value="회원가입" onclick="joinForm()">
			<input type="button" value="로그인" onclick="loginForm()">
		</c:when>
		<c:otherwise>
			<input type="button" value="게임 시작" onclick="towerForm(1)">	
			<input type="button" value="정보 검색" onclick="searchForm()">	
			<input type="button" value="로그아웃" onclick="logout()">
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>