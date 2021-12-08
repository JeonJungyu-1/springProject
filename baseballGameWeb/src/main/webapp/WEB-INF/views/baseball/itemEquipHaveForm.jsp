<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function itemRemove(itemId) {
	location.href = "/baseball/itemRemove?itemId=" + itemId;
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
	<h2 class="mb-5">장착한 아이템</h2>
	<div class="table-responsive custom-table-responsive">
	<table class="table custom-table">
		<thead>
		<tr>
			<th scope="col">종류</th>
			<th scope="col">이름</th>
			<th scope="col">설명</th>
			<th scope="col"></th>
		</tr>
		</thead>
		<tbody>
	<c:forEach items="${result }" var="d">
		<tr>
			<td>
				${d.itemClass }
			</td>
			<td>${d.itemName }</td>
			<td>${d.summary }</td>
			<td>
				<button class="menu" onclick="itemRemove(${d.itemId })">해제</button>
			</td>
		</tr>
		<tr class="spacer"><td colspan="100"></td></tr>
	</c:forEach>
		</tbody>
	</table>
	<c:choose>
		<c:when test="${param.yes == 1 }">
			<h2>해제 성공</h2>
		</c:when>
		<c:when test="${param.yes == 2 }">
			<h2>장착한 아이템이 없습니다.</h2>
		</c:when>
	</c:choose>
	<br><br><button class="menu" onclick="mainMenu()">메인메뉴</button>
</div>
</div>
</div>
	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>
</body>
</html>