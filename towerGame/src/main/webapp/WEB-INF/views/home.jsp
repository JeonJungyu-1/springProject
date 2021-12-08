<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>탑 오르기</title>
<script type="text/javascript">
function mainForm() {
	location.href = "/mainForm";
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
	<h1>
		탑 오르기
	</h1>
	
	<input type="button" value="시작하기" onclick="mainForm()">
</div>
</body>
</html>
