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
	<h2 class="mb-5">[ 퀴즈 ]</h2>
	
		<div class="table-responsive custom-table-responsive">
	<form action="/baseball/quiz" method="post" onsubmit="">
		<table class="table custom-table">
			<c:forEach items="${quiz }" var="d" varStatus="s">
				<thead>
				<tr>
					<th>${s.index + 1 }번 문제</th>
				</tr>
				</thead>
				<tbody>
				<tr>
					<td>${d.question }</td>
				</tr>
				<tr>
					<td>
						<input type="radio" name=${"problem" += s.index } value=${d.example1 } checked="checked">${d.example1 }
						<input type="radio" name=${"problem" += s.index } value=${d.example2 }>${d.example2 }
						<input type="radio" name=${"problem" += s.index } value=${d.example3 }>${d.example3 }
						<input type="radio" name=${"problem" += s.index } value=${d.example4 }>${d.example4 }
						<input type="hidden" name=${"correct" += s.index } value=${d.correct }>					
					</td>
				</tr>
				<tr class="spacer"><td colspan="100"></td></tr>
				</tbody>
			</c:forEach>
			<tr>
				<td colspan="2">
					<input class="menu" type="submit" value="제출">
				</td>
			</tr>
		</table>
	</form>
	
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