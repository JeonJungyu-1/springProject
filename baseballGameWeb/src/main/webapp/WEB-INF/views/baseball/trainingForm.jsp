<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function hitterPower() {
	location.href="/baseball/coachForm?trainingId="+1;
}
function hitterHit() {
	location.href="/baseball/coachForm?trainingId="+2;
}
function hitterRunSpeed() {
	location.href="/baseball/coachForm?trainingId="+3;
}
function pitcherBallSpeed() {
	location.href="/baseball/coachForm?trainingId="+4;
}
function pitcherBallControl() {
	location.href="/baseball/coachForm?trainingId="+5;
}
function pitcherMentality() {
	location.href="/baseball/coachForm?trainingId="+6;
}
function mainMenu() {
	location.href = "/baseball/mainMenu";
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
	<h2 class="mb-5">[ 훈련 ]</h2>
	<br><br>
	<c:choose>
		<c:when test="${sessionScope.classNm == '타자' }">
			<h2 class="mb-5">-- 타자 --</h2>
			<button class="menu" onclick="hitterPower()">타격파워</button>
			<button class="menu" onclick="hitterHit()">컨택</button>
			<button class="menu" onclick="hitterRunSpeed()">주루</button>
		</c:when>
		
		<c:when test="${sessionScope.classNm == '투수' }">
			<h2 class="mb-5">-- 투수 --</h2>
			<button class="menu" onclick="pitcherBallSpeed()">볼스피드</button>
			<button class="menu" onclick="pitcherBallControl()">볼컨트롤</button>
			<button class="menu" onclick="pitcherMentality()">정신력</button>
		</c:when>
	</c:choose>
	
	<c:choose>
		<c:when test="${param.yes == 1 }">
			<h2>훈련 성공</h2>
		</c:when>
		<c:when test="${param.yes == 2 }">
			<h2>훈련 실패</h2>
		</c:when>
		<c:when test="${param.yes == 3 }">
			<h2>행동력이 부족합니다.</h2>
		</c:when>
		<c:when test="${param.yes == 4 }">
			<h2>체력이 부족합니다.</h2>
		</c:when>
	</c:choose>
	
		<br><br><button class="menu" onclick="mainMenu()">메인메뉴</button>
	
	</div>
	</div>
	


	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>
</body>
</html>