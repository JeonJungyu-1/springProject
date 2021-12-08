<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보검색</title>
<script type="text/javascript">
function boardSearch() {
	var searchForm = document.getElementById("search");
	searchForm.submit();
}
function back() {
	location.href = "/mainForm";
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
	<form action="/board/search" id="search">
		<span>검색어</span>
		<input type="text" name="searchText">
		<input type="button" value="검색" onclick="boardSearch()"><br>
		<span>입력할 수 있는 검색어 : 게임소개, 공략법, 몬스터</span>
	</form>
		<input type="button" value="뒤로 가기" onclick="back()">
</div>
</body>
</html>