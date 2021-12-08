<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 업데이트</title>
<script type="text/javascript">
function formCheck() {
	var board_context = document.getElementById("board_context").value;
	
	if (board_context.trim().length <= 0 ) {
		alert("내용을 입력하세요.");
		return false;
	}
	return true;
}

function deleteFile(board_title) {
	location.href = "/board/deleteFile?board_title="+board_title;
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
	<h1>[ 글 업데이트 ]</h1><br>
	<form action="/board/update" method="post" enctype="multipart/form-data" onsubmit="return formCheck();">
		<table border="1">
			<tr>
				<th colspan="3">
					<h2>${result.BOARD_TITLE }</h2>
					<input type="hidden" name="board_title" value="${result.BOARD_TITLE }">
				</th>
			</tr>
			<tr>
				<th colspan="3">내용</th>
			</tr>
			<tr>
				<td colspan="3">
					<textarea rows="5" cols="50" name="board_context" id="board_context">${result.BOARD_CONTEXT }</textarea>
				</td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td>
					<c:choose>
						<c:when test="${empty result.BOARD_ORIGINAL }">
							<input type="file" name="upload">
						</c:when>
						<c:otherwise>
							${result.BOARD_ORIGINAL }
						</c:otherwise>
					</c:choose>
				</td>
				<td>
					<input type="button" value="삭제" onclick="deleteFile('${result.BOARD_TITLE}')">
				</td>
			</tr>
			<tr>
				<th colspan="3">
					<input type="submit" value="수정하기">
				</th>
			</tr>
		</table>
	</form>
	<input type="button" value="검색창으로 돌아가기" onclick="back()">
</div>
</body>
</html>