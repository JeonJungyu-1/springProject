<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>승리</title>
<script type="text/javascript">
function continues(tower_floor) {
	location.href = "/tower/towerForm?currentPage="+tower_floor;
}
function next(tower_floor) {
	location.href = "/tower/towerForm?currentPage="+tower_floor;
}
function back() {
	location.href = "/mainForm";
}
</script>
<style type="text/css">
	body {
		background-image: url('/resources/images/background/2.jpg');
		background-repeat: no-repeat;
		background-size: cover;
		display: flex;
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
		<h1>승리하셨습니다.</h1>
		<c:choose>
			<c:when test="${tower_floor < 15 }">
				<input type="button" value="계속하기" onclick="continues(${tower_floor })">
				<input type="button" value="다음 층" onclick="next(${tower_floor + 1 })">
			</c:when>
			<c:otherwise>
				<h2>탑의 마지막까지 오셨습니다.</h2>
				<input type="button" value="계속하기" onclick="continues(${tower_floor })">
			</c:otherwise>		
		</c:choose>
		<input type="button" value="돌아가기" onclick="back()">
	</div>
</body>
</html>