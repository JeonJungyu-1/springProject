<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>탑</title>
<script type="text/javascript">
	function attack(tower_floor) {
		location.href = "/tower/fight?tower_floor="+tower_floor;
	}
	
	function run() {
		location.href = "/mainForm";
	}
</script>
<style type="text/css">
	body {
		background-image: url('/resources/images/tower/${result.tower_photo }.png');
		background-repeat: no-repeat;
		background-size: cover;
	}
	
	table {
		border: 1px solid;
		background-color: white;
		text-align: center;
	}
	tr, td {
		border: 1px solid;
	}
	.round {
		position: absolute;
		clear: left;
		float: left;
		width: 600px;
		height: 50px;
		left: 100px;
		bottom: 50px;
	}
	.button {
		width: 150px;
		border-radius: 5%;
		background-color: #61ff78;
		color: #ffff6e;
	}
</style>

</head>
<body>
	<h1>[ 탑 ${result.tower_floor }층 ]</h1>
	
	<div style="width:25%; float:left;">
		<br><br>
		<table>
			<tr>
				<td colspan="2">내 정보</td>
			</tr>
			<tr>
				<td>레벨</td>
				<td>
					${member.member_level }
				</td>
			</tr>
			<tr>
				<td>공격력</td>
				<td>
					${member.member_attack }
				</td>
			</tr>
			<tr>
				<td>경험치</td>
				<td>
					${member.member_exp }0%
				</td>
			</tr>
			<tr>
				<td>클리어한 보스</td>
				<td>
					${member.member_boss }라운드
				</td>
			</tr>
		</table>
	</div>
	
	<div style="width:25%; float:left;">
	<br><br><br>
		<input type="button" class="button" value="공격" onclick="attack(${result.tower_floor })"><br><br>
		<input type="button" class="button" value="도망" onclick="run()">
	</div>
	
	
	
	<div style="width:50%; float:right;">
		<br><br>
		<table>
			<tr>
				<td>
					<c:choose>
						<c:when test="${towermon.monster_boss == 1 }">
							<img alt="towermon" src="/resources/images/boss/${towermon.monster_photo }.png" width="70" height="70">					
						</c:when>
						<c:otherwise>
							<img alt="towermon" src="/resources/images/monster/${towermon.monster_photo }.png" width="70" height="70">					
						</c:otherwise>
					</c:choose>
				</td>
			</tr> 
		
		</table><br><br>
	
	
		<table>
			<tr>
				<td colspan="2">몬스터 정보</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>
					${towermon.monster_name }
				</td>
			</tr>
			<tr>
				<td>hp</td>
				<td>
					${towermon.monster_hp * result.tower_floor }
				</td>
			</tr>
		</table>
	</div>
	
	
	<div class="round"> 
		<c:forEach begin="${navi.startPageGroup }" end="${navi.endPageGroup }" var="n">
			<c:choose>
				<c:when test="${navi.currentPage == n }">
					<a href = "/tower/towerForm?currentPage=${n }" style="color: red; font-size: 120%;">${n }층</a>
				</c:when>
				<c:otherwise>
					<c:choose>
						<c:when test="${navi.endPageGroup == n }">
							<a href = "/tower/towerForm?currentPage=${n }" style="font-size: 120%;">${n }층(보스)</a>
						</c:when>
						<c:otherwise>
							<a href = "/tower/towerForm?currentPage=${n }">${n }층</a>
						</c:otherwise>					
					</c:choose>
				</c:otherwise>
			</c:choose>
		
		</c:forEach>
	
		<c:if test="${result.tower_floor != 15}">
			<c:choose>
				<c:when test="${member.member_boss > navi.currentGroup }">
					<a href = "/tower/towerForm?currentPage=${navi.endPageGroup + 1 }">다음 라운드</a>
				</c:when>
			</c:choose>
		</c:if>
	</div>
</body>
</html>