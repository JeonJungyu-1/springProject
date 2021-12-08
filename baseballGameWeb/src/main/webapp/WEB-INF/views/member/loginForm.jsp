<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function formCheck() {
	var member_id = document.getElementById("member_id").value;
	var member_password = document.getElementById("member_password").value;

	if(member_id.trim().length <= 0) {
		alert("아이디를 입력하세요.");
		return false;
	}

	if(member_password.trim().length <= 0) {
		alert("비밀번호를 입력하세요.");
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
	<h2 class="mb-5">[ 로그인 ]</h2>
	<div class="table-responsive custom-table-responsive">
	<form action="/member/login" method="post" onsubmit="return formCheck();">
		<table class="table custom-table">
			<tbody>
			<tr>
				<td>ID</td>
				<td>
					<input type="text" name="userId" id="userId">
				</td>
			</tr>
			<tr class="spacer"><td colspan="100"></td></tr>
			<tr>
				<td>Password</td>
				<td>
					<input type="password" name="password" id="password">
				</td>
			</tr>
			<tr class="spacer"><td colspan="100"></td></tr>
			<tr>
				<td colspan="2">
					<input type="submit" class="menu" value="로그인">
				</td>
			</tr>
			<tr class="spacer"><td colspan="100"></td></tr>
			<tr>
				<td colspan="2">
					<input type="button" class="menu" onclick="home()" value="홈">
				</td>
			</tr>	
			<tr class="spacer"><td colspan="100"></td></tr>
			</tbody>
		</table>
	</form>
</div>
</div>
</div>

	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>

</body>
</html>