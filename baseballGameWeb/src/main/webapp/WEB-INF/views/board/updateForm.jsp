<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function formCheck() {
	var board_title = document.getElementById("board_title").value;
	var board_content = document.getElementById("board_content").value;
	
	if (board_title.trim().length <= 0) {
		alert("제목을 입력하세요.");
		return false;
	}
	
	if (board_content.trim().length <= 0) {
		alert("내용을 입력하세요.");
		return false;
	}
	
	return true;
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
	<form action="/board/update" method="post" onsubmit="return formCheck();">
		<input type="hidden" name="board_num" value=${result.board_num }>
		<table border="1">
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="board_title" id="board_title" value=${result.board_title }>
				</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>
					<textarea rows="20" cols="20" name="board_content" id="board_content">${result.board_content }</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">
				</td>
			</tr>
		</table>
	</form>

	<script src="/resources/js/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>
</body>
</html>