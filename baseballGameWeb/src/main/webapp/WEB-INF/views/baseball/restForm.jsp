<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function rest1() {
	location.href = "/baseball/rest1";
}
function rest2() {
	location.href = "/baseball/rest2";
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
	<h2 class="mb-5">휴식</h2>
	<button class="menu" onclick="rest1()">일반 휴식</button>
	<button class="menu" onclick="rest2()">고급 휴식</button>
	<c:choose>
		<c:when test="${param.result == 1 }">
			<h2>[ 일반 휴식 성공 ]</h2>
			<h2>체력이 20 회복되었습니다.</h2>
			<h2>2000골드 소비되었습니다.</h2>
		</c:when>
		<c:when test="${param.result == 2 }">
			<h2>[ 일반 휴식 실패 ]</h2>
			<h2>체력이 80보다 높습니다.</h2>
		</c:when>
		<c:when test="${param.result == 3 }">
			<h2>[ 일반 휴식 실패]</h2>
			<h2>돈이 부족합니다.</h2>
		</c:when>
		<c:when test="${param.result == 4 }">
			<h2>[ 일반 휴식 실패]</h2>
			<h2>행동력이 부족합니다.</h2>
		</c:when>
		<c:when test="${param.result == 5 }">
			<h2>[ 고급 휴식 성공 ]</h2>
			<h2>체력이 100까지 회복되었습니다.</h2>
			<h2>4000골드 소비되었습니다.</h2>
		</c:when>
		<c:when test="${param.result == 6 }">
			<h2>[ 고급 휴식 실패 ]</h2>
			<h2>체력이 이미 100입니다.</h2>
		</c:when>
		<c:when test="${param.result == 7 }">
			<h2>[ 고급 휴식 실패 ]</h2>
			<h2>돈이 부족합니다.</h2>
		</c:when>
		<c:when test="${param.result == 8 }">
			<h2>[ 고급 휴식 실패 ]</h2>
			<h2>행동력이 부족합니다.</h2>
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