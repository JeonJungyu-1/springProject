<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
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
	<h2 class="mb-5">명예의 전당</h2>
	<div class="table-responsive custom-table-responsive">
	<table class="table custom-table">
		<thead>
		<tr>
			<th scope="col">순위</th>
			<th scope="col">캐릭터 이름</th>
			<th scope="col">유저 ID</th>
			<th scope="col">올스탯</th>
			<th scope="col">클래스</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${result }" var="b" varStatus="s">
			<tr>
				<th>${s.index + 1 }</th>
				<td>${b.characterName }</td>
				<td>${b.userId }</td>
				<td>${b.allStat }</td>
				<td>${b.className }</td>
			</tr>
			<tr class="spacer"><td colspan="100"></td></tr>
		</c:forEach>
		</tbody>
	</table>
	<br><br><button class="menu" onclick="home()">홈</button>
</div>
</div>
</div>

	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>

</body>
</html>