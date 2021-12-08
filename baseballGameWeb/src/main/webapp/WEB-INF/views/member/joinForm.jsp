<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function formCheck() {
	var userId = document.getElementById("userId").value;
	var password = document.getElementById("password").value;

	if(userId.trim().length <= 0) {
		alert("아이디를 입력하세요.");
		return false;
	}
	else if(userId.replace(" ", "").length != userId.length) {
		alert("아이디는 띄어쓰기를 하지 마세요.");
		return false;
	}
	else if(userId.length < 3 || userId.length > 10) {
		alert("아이디는 3~10자로 입력하세요.")
		return false;
	}

	if(password.trim().length <= 0) {
		alert("비밀번호를 입력하세요.");
		return false;
	}
	else if(password.replace(" ", "").length != password.length) {
		alert("비밀번호는 띄어쓰기를 하지 마세요.");
		return false;
	}
	else if(password.length < 3 || password.length > 10) {
		alert("비밀번호는 3~10자로 입력하세요.")
		return false;
	}

	return true;
}

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
	<h2 class="mb-5">[ 회원 가입 ]</h2>
<div class="table-responsive custom-table-responsive">
	<form action="/member/join" method=post onsubmit="return formCheck();">
		<table class="table custom-table">
			<tr>
				<th>ID</th>
				<td>
					<input type="text" name="userId" id="userId">
				</td>
			<tr>
			<tr class="spacer"><td colspan="100"></td></tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="password" id="password">
				</td>
			</tr>
			<tr class="spacer"><td colspan="100"></td></tr>
			<tr>
				<td colspan="2">
					<input type="submit" class="menu" value="가입">
				</td>
			</tr>
			<tr class="spacer"><td colspan="100"></td></tr>
			<tr>
				<td colspan="2">
					<input type="button" class="menu" onclick="home()" value="홈">
				</td>
			</tr>
			<tr class="spacer"><td colspan="100"></td></tr>
		</table>
	</form>
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