<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 실패</title>
<script type="text/javascript">
function back() {
	location.href = "/board/searchForm";
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
	<h1>검색 실패</h1>
	<span>검색이 실패 하였으니 다시 입력하세요</span><br>
	<span>입력할 수 있는 검색어 : 게임소개, 공략법, 몬스터</span>
	<input type="button" value="검색창으로 돌아가기" onclick="back()">
</div>
</body>
</html>