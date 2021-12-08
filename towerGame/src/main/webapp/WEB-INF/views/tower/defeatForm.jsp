<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>패배</title>
<script type="text/javascript">
function down(tower_floor) {
	location.href = "/tower/towerForm?currentPage="+tower_floor;
}
function again(tower_floor) {
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
		<h1>패배하셨습니다.</h1>
		<input type="button" value="이전층" onclick="down(${tower_floor-1 })">
		<input type="button" value="다시 도전" onclick="again(${tower_floor })">
		<input type="button" value="돌아가기" onclick="back()">
	</div>
</body>
</html>