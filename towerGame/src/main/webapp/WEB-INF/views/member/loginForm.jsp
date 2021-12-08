<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script type="text/javascript">
function formCheck() {
	var member_id = document.getElementById("member_id").value;
	var member_password = document.getElementById("member_password").value;
	
	if (member_id.trim().length <= 0) {
		alert("아이디를 입력하세요.");
		return false;
	}
	
	if (member_password.trim().length <= 0) {
		alert("비밀번호를 입력하세요.");
		return false;
	}
	
	
	return true;
}
</script>
<style type="text/css">
	body {
		background-image: url('/resources/images/background/1.jpg');
		background-repeat: no-repeat;
		background-size: cover;
	}
	
	.home {
		position: absolute;
		top: 50%;
		left: 50%;
		transform: translate(-50%, -50%);
	}
</style>
</head>
<body>
<div class="home">
	<form action="/member/login" method="post" onsubmit="return formCheck();">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="member_id" id="member_id">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="member_password" id="member_password">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="로그인">
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>