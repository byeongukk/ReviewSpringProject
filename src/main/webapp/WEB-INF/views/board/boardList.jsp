<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>   
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp"/>

	<table id="boardArea" align="center" style="text-align:center;">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
 		<c:forEach var="board" items="${ boardList }">
			<tr>
			
				<td><c:out value="${ board.bNo }"/></td>
				<td><c:out value="${ board.bTitle }"/></td>
				<td><c:out value="${ board.bWriter }"/></td>
				<td><c:out value="${ board.bCount }"/></td>
				<td><c:out value="${ board.writenDate }"/></td>					
			</tr>
		</c:forEach>
		<jsp:include page="serchBar.jsp"/>
	</table>
	<c:if test="${ !empty sessionScope.loginMember }">
		<button onclick="location.href='showBoardInsertForm.bo?bCode=${bCode}'">글쓰기</button>
	</c:if>
</body>
	




















