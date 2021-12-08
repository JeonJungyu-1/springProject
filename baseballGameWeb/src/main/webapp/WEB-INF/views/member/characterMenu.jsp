<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>캐릭터 메뉴</title>
<script type="text/javascript">
function characterCreateForm() {
	location.href="/member/characterCreateForm";
}
function classSelect() {
	location.href="/member/classSelect";
}
function characterDeleteForm() {
	location.href="/member/characterDeleteForm";
}
function home() {
	location.href = "/";
}
</script>
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
</head>
<body>
<div class="content">
    
    <div class="container">
	<h2 class="mb-5">캐릭터 메뉴</h2>
	<button class="menu" onclick="characterCreateForm();">캐릭터 생성</button><br><br>
	<button class="menu" onclick="classSelect();">캐릭터 선택</button><br><br>
	<button class="menu" onclick="characterDeleteForm();">캐릭터 삭제</button>
	<br><br><button class="menu" onclick="home()">홈</button>
	<c:if test="${param.yes == 1 }">
			<h2>[ 은퇴 ]</h2>
			<h2>5년차가 지나서 선수 데이터가 명예의 전당으로 이동했습니다.</h2>
	</c:if>
	
</div>
</div>
	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>

</body>
</html>