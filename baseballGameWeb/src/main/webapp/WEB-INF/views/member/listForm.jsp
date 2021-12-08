<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<h2 class="mb-5">[ 캐릭터 목록 ]</h2>
	<div class="table-responsive custom-table-responsive">
	<table class="table custom-table">
		<c:choose>
			<c:when test="${sessionScope.classNm == '타자' }">
				<thead>
				<tr>
					<th scope="col">캐릭터 이름</th>
					<th scope="col">클래스</th>
					<th scope="col">타격파워</th>
					<th scope="col">컨택</th>
					<th scope="col">주루</th>
				</tr>
				</thead>
				<c:forEach items="${result }" var="d">
					<tbody>
					<tr>
						<td>
							<a href="/baseball/main?characterId=${d.characterId }">${d.characterName }</a>
						</td>
						<td>
							${d.className }
						</td>
						<td>
							${d.hitterPower }
						</td>
						<td>
							${d.hitterHit }
						</td>
						<td>
							${d.hitterRunSpeed }
						</td>
					</tr>
					<tr class="spacer"><td colspan="100"></td></tr>
					</tbody>
				</c:forEach>
			</c:when>
			
			<c:when test="${sessionScope.classNm == '투수' }">
				<thead>
				<tr>
					<th scope="col">캐릭터 이름</th>
					<th scope="col">클래스</th>
					<th scope="col">볼스피드</th>
					<th scope="col">볼컨트롤</th>
					<th scope="col">정신력</th>
				</tr>
				</thead>
				<c:forEach items="${result }" var="d">
					<tbody>
					<tr>
						<td>
							<a href="/baseball/main?characterId=${d.characterId }">${d.characterName }</a>
						</td>
						<td>
							${d.className }
						</td>
						<td>
							${d.pitcherBallSpeed }
						</td>
						<td>
							${d.pitcherBallControl }
						</td>
						<td>
							${d.pitcherMentality }
						</td>
					</tr>	
					<tr class="spacer"><td colspan="100"></td></tr>
					</tbody>
				</c:forEach>
			</c:when>
		</c:choose>
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