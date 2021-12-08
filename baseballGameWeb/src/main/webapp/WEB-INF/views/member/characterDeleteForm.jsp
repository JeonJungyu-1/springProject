<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function characterDelete(characterId) {
	location.href = "/member/characterDelete?characterId="+characterId;
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
	<h2 class="mb-5">[ 캐릭터 삭제 ]</h2>
	<div class="table-responsive custom-table-responsive">
	<table class="table custom-table">
		<thead>
		<tr>
			<th scope="col">캐릭터 이름</th>
			<th scope="col">클래스</th>
			<th scope="col">올스탯</th>
			<th scope="col"></th>
		</tr>
		</thead>
			<tbody>
		<c:forEach items="${result }" var="d">
			<tr>
				<td>
					${d.characterName }
				</td>
				<td>
					${d.className }
				</td>
				<td>
					${d.allStat }
				</td>
				<td>
					<input type="button" value="삭제" onclick="characterDelete(${d.characterId })">
				</td>
			</tr>
			<tr class="spacer"><td colspan="100"></td></tr>
		</c:forEach>
			</tbody>
	</table>
	<br><br>
	<c:choose>
		<c:when test="${param.yes == 1 }">
			<h2>삭제 성공</h2>
			
		</c:when>
		<c:when test="${param.yes == 2 }">
			<h2>삭제 실패</h2>
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