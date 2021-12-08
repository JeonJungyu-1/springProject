<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function writeForm() {
	location.href="/board/writeForm";
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
	<h1>[ ${member_id }님의 블로그]</h1>
	
	<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>등록일</td>
		</tr>
		<c:forEach items="${result }" var="d">
			<tr>
				<td>${d.board_num }</td>
				<td>
					<a href="/board/detail?board_num=${d.board_num}">${d.board_title }</a>
				</td>
				<td>${d.board_inputdate }</td>
			</tr>
		</c:forEach>
	</table>
	
	<c:if test="${member_id == sessionScope.loginId }">
		<input type="button" value="글쓰기" onclick="writeForm()">
	</c:if>
	

	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>
</body>
</html>