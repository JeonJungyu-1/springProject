<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게임소개</title>
<script type="text/javascript">
function updateForm(board_title){
	location.href = "/board/updateForm?board_title="+board_title;
}
function download(board_title) {
	location.href = "/board/download?board_title="+board_title;
}
function back() {
	location.href = "/board/searchForm";
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
	<h1>${result.BOARD_TITLE }</h1><br>
	<table border="1">
		<tr>
			<th colspan="3">내용</th>
		</tr>
		<tr>
			<td colspan="3">${result.BOARD_CONTEXT }</td>
		</tr>
		<tr>
			<th>마지막 수정날짜</th>
			<td colspan="2">${result.BOARD_LASTINDATE }</td>
		</tr>
		<tr>
			<th>마지막 수정자</th>
			<td colspan="2">${result.MEMBER_LASTID } (${result.MEMBER_NAME })</td>
		</tr>
		<tr>
			<th>참고 자료</th>
			<td>${result.BOARD_ORIGINAL }</td>
			<td>
				<c:if test="${not empty result.BOARD_ORIGINAL }">
					<input type="button" value="다운로드" onclick="download('${result.BOARD_TITLE}')">
				</c:if>
			</td>
		</tr>
	</table>
	<input type="button" value="글 업데이트" onclick="updateForm('${result.BOARD_TITLE}')">
	<input type="button" value="검색창으로 돌아가기" onclick="back()">
</div>
</body>
</html>