<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 페이지</title>
</head>
<style>
	a{
		text-decoration: none;
		color:inherit;
	}
	td,th{
		padding:10px 90px;
		text-align: center;
	}
	table{
		margin: 0 auto;
	}
	table,td,th{
		border: 1px,#000 solid;
		border-collapse: collapse;
	}
	th{
		background-color: #000;
		color: #fff;
	}
	.title{
		text-align: center;
	}
	.btngroup{
		width:200px;
		margin-left:60%;
	}
	button,input {
		margin-top:10px;
		margin-right:5px;
		float:right;
	}
	
}
</style>
<body>
	<div>
		<h1 class="title">직원 상세페이지</h3>
		<table>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>부서번호</th>
			</tr>
			<tr>
				<td>
					<c:out value="${employee.idx}"/>
				</td>
				<td>
					<c:out value="${employee.name}"/>
				</td>
				<td>
					<c:out value="${employee.deptid}"/>
				</td>
			</tr>
		</table>
		<div class="btngroup">
			<form action="../employee/showUpdatingEmployee.do" method="post">
				<input type="hidden" name = "idx" value="${employee.idx}">
				<input type="hidden" name = "name" value="${employee.name}">
				<input type="hidden" name = "deptid" value="${employee.deptid}">
				<button type="submit">수정</button>
			</form>
			<button type="button">
				<a onclick="if(confirm('정말 삭제하시겠습니까?') == false) return false;"
				href="../employee/deleteEmployee.do?idx=<c:out value="${employee.idx}"/>">삭제</a>
			</button>
			<button onclick="history.back();">뒤로가기</button>
		</div>
	</div>
</body>
</html>