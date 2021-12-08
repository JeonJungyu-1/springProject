<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function hitterCreate() {
	var hitterName = document.getElementById("hitter").value;
	location.href = "/member/hitterCreate?characterName="+hitterName;
}
function pitcherCreate() {
	var pitcherName = document.getElementById("pitcher").value;
	location.href = "/member/pitcherCreate?characterName="+pitcherName;
}
function back() {
	location.href = "/member/characterMenu";
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
	<h2 class="mb-5">[ 캐릭터 생성 ]</h2>
	<div class="table-responsive custom-table-responsive">
	<table class="table custom-table">
		<tbody>
		<tr>
			<th>타자</th>
			<td>
				<input type="text" id="hitter" >
			</td>
			<td>
				<button class="menu" onclick="hitterCreate()">생성</button>
			</td>
		</tr>
		<tr class="spacer"><td colspan="100"></td></tr>
		<tr>
			<th>투수</th>
			<td>
				<input type="text" id="pitcher">
			</td>
			<td>
				<button class="menu" onclick="pitcherCreate()">생성</button>
			</td>
		</tr>
		</tbody>
	</table>
	
	<c:choose>
		<c:when test="${param.yes == 1 }">
			<h2>생성 성공</h2>
		</c:when>
		<c:when test="${param.yes == 2 }">
			<h2>생성 실패</h2>
		</c:when>
		
	</c:choose>
	
	<br><br><button class="menu" onclick="back()">뒤로</button>
	
</div>
</div>
</div>
	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>
</body>
</html>