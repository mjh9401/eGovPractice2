<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원검색결과</title>
</head>
<style>
	.wrap{
		width: 800px;
		margin: 0 auto;
	}
	td,th{
		padding:10px 30px;
		text-align: center;
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
		padding-bottom: 30px;
	}

</style>

<body>
	<div class="wrap">
		<h1 class="title">직원 검색 결과</h1>
		<c:choose>
			<c:when test="${!empty members}">
				<table border="1">
					<tr>
						<th>번호</th>
						<th>이름</th>
						<th>주소</th>
						<th>이메일</th>
						<th>전화번호</th>
					</tr>
					<c:forEach items="${members}" var="member"> 
						<tr>
							<td>${member.idx}</td>		
							<td>${member.name}</td>		
							<td>${member.address}</td>		
							<td>${member.email}</td>		
							<td>${member.tel}</td>				
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:when test="${empty members}">
				<c:set var="memberEmpty" value="true"/>
			</c:when>
		</c:choose>
	</div>
	<script>
		let status = '<c:out value="${memberEmpty}"/>';
		if(status){
			alert("검색결과가 없습니다.");
			history.back();	
		}
	</script>
</body>
</html>