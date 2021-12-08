<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">
function formCheck() {
	var member_id = document.getElementById("member_id").value;
	var member_password = document.getElementById("member_password").value;
	var member_name = document.getElementById("member_name").value;
	
	if (member_id.trim().length <= 0) {
		alert("아이디를 입력하세요.");
		return false;
	}
	
	if (member_password.trim().length <= 0) {
		alert("비밀번호를 입력하세요.");
		return false;
	}
	
	if (member_name.trim().length <= 0) {
		alert("닉네임을 입력하세요.");
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
</style>
</head>
<body>
<form action="/member/join" method="post" onsubmit="return formCheck();">
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
			<td>닉네임</td>
			<td>
				<input type="text" name="member_name" id="member_name">
			</td>
		</tr>
		<tr>
			<td>캐릭터 사진</td>
			<td>
				<input type="radio" name="member_photo" value="1" checked="checked">
					<img alt="1번 캐릭터" src="/resources/images/profile/1.png" width="50" height="50">
				<input type="radio" name="member_photo" value="2">
					<img alt="2번 캐릭터" src="/resources/images/profile/2.png" width="50" height="50">
				<input type="radio" name="member_photo" value="3">
					<img alt="3번 캐릭터" src="/resources/images/profile/3.png" width="50" height="50">
				<input type="radio" name="member_photo" value="4">
					<img alt="4번 캐릭터" src="/resources/images/profile/4.png" width="50" height="50">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="가입하기">
			</td>
		</tr>
	</table>
</form>
</body>
</html>