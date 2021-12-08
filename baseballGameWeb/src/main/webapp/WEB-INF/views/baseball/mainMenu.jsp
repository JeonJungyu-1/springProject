<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 메뉴</title>
<script type="text/javascript">
function playForm() {
	location.href = "/baseball/playForm";
}
function restForm() {
	location.href = "/baseball/restForm";
}
function trainingForm() {
	location.href = "/baseball/trainingForm";
}
function characterInfoMenu() {
	location.href = "/baseball/characterInfoMenu";
}
function storeForm() {
	location.href = "/baseball/storeForm";
}
function quizMenu() {
	location.href = "/baseball/quizMenu";
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
	<h2 class="mb-5">[ 메인 메뉴 ]</h2>
	<button class="menu" onclick="playForm()">경기</button><br><br>
	<button class="menu" onclick="restForm()">휴식</button><br><br>
	<button class="menu" onclick="trainingForm()">훈련</button><br><br>
	<button class="menu" onclick="characterInfoMenu()">캐릭터 정보</button><br><br>
	<button class="menu" onclick="storeForm()">상점</button><br><br>
	<button class="menu" onclick="quizMenu()">퀴즈</button><br><br>
	<button class="menu" onclick="home()">홈</button>
</div>
</div>

	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>

</body>
</html>