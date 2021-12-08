<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
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
	<h2 class="mb-5">[ 캐릭터 스탯 ]</h2>
	<div class="table-responsive custom-table-responsive">
	<table class="table custom-table">
		<c:choose>
			<c:when test="${sessionScope.classNm == '타자' }">
				<tbody>
				<tr>
					<th>캐릭터 이름</th>
					<td>${result.characterName }</td>
				</tr>
				<tr>
					<th>클래스</th>
					<td>${result.className }</td>
				</tr>
				<tr>
					<th>행동력</th>
					<td>${result.active }</td>
				</tr>
				<tr>
					<th>소지금</th>
					<td>${result.gold }</td>
				</tr>
				<tr>
					<th>체력</th>
					<td>${result.health }</td>
				</tr>
				<tr>
					<th>연차</th>
					<td>${result.year }</td>
				</tr>
				<tr>
					<th>타격파워</th>
					<td>${result.hitterPower }
					<c:forEach items="${item }" var="d">
							<c:if test="${d.itemClass == '글러브' }">+ ${d.itemValue }(${d.itemClass } 장착효과)</c:if>
					</c:forEach>
					</td>				
				</tr>
				<tr>
					<th>컨택</th>
					<td>${result.hitterHit }
					<c:forEach items="${item }" var="d">
							<c:if test="${d.itemClass == '배트' }">+ ${d.itemValue }(${d.itemClass } 장착효과)</c:if>
					</c:forEach>
					</td>			
				</tr>
				<tr>
					<th>주루</th>
					<td>${result.hitterRunSpeed }
					<c:forEach items="${item }" var="d">
							<c:if test="${d.itemClass == '유니폼' }">+ ${d.itemValue }(${d.itemClass } 장착효과)</c:if>
					</c:forEach>
					</td>				
				</tr>
				</tbody>
			</c:when>
			
			
			<c:when test="${sessionScope.classNm == '투수' }">
				<tbody>
				<tr>
					<th>캐릭터 이름</th>
					<td>${result.characterName }</td>
				</tr>
				<tr>
					<th>클래스</th>
					<td>${result.className }</td>
				</tr>
				<tr>
					<th>행동력</th>
					<td>${result.active }</td>
				</tr>
				<tr>
					<th>소지금</th>
					<td>${result.gold }</td>
				</tr>
				<tr>
					<th>체력</th>
					<td>${result.health }</td>
				</tr>
				<tr>
					<th>연차</th>
					<td>${result.year }</td>
				</tr>
				<tr>
					<th>볼스피드</th>
					<td>${result.pitcherBallSpeed }
					<c:forEach items="${item }" var="d">
							<c:if test="${d.itemClass == '글러브' }">+ ${d.itemValue }(${d.itemClass } 장착효과)</c:if>
					</c:forEach>
					</td>				
				</tr>
				<tr>
					<th>볼컨트롤</th>
					<td>${result.pitcherBallControl }
					<c:forEach items="${item }" var="d">
							<c:if test="${d.itemClass == '배트' }">+ ${d.itemValue }(${d.itemClass } 장착효과)</c:if>
					</c:forEach>
					</td>			
				</tr>
				<tr>
					<th>정신력</th>
					<td>${result.pitcherMentality }
					<c:forEach items="${item }" var="d">
							<c:if test="${d.itemClass == '유니폼' }">+ ${d.itemValue }(${d.itemClass } 장착효과)</c:if>
					</c:forEach>
					</td>				
				</tr>
				</tbody>
			</c:when>
		</c:choose>
	</table>
	
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