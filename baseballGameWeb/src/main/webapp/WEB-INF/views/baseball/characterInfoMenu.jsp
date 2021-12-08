<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function characterStat() {
	location.href = "/baseball/characterStat";
}
function itemEquipHaveForm() {
	location.href = "/baseball/itemEquipHaveForm";
}
function itemHaveForm() {
	location.href = "/baseball/itemHaveForm";
}
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
	<h2 class="mb-5">캐릭터 정보</h2>
	<button class="menu" onclick="characterStat()">스탯</button>
	<button class="menu" onclick="itemEquipHaveForm()">장착 아이템</button>
	<button class="menu" onclick="itemHaveForm()">소지 아이템</button>
	
	<br><br><button class="menu" onclick="mainMenu()">메인메뉴</button>
</div>	
</div>
	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>

</body>
</html>