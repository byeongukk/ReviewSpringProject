<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>   
<style>
	.errorCode{
		color: red;
		font : bold;
	}
</style>

</head>
<body>
	
	<jsp:include page="../common/menubar.jsp"/>
	<h1 align="center">게시글 작성</h1>
	<hr>
	
	<div align="center">
		<br><br><br><br><br>
		<form:form modelAttribute="board" name="" action="${conextPath}/insertBoard.bo" id="boardInsertForm" method="post">
			<form:errors path="bTitle" class="errorCode"/><br><br>
			<form:label path="bTitle">제목</form:label>
			<form:input path="bTitle" name="bTitle" placeholder="제목"/>
			<br><br>
			<form:errors path="bContent" class="errorCode"/><br><br>	
			<form:label path="bContent" name="bContent">내용</form:label>
			<form:textarea path="bContent" name="bContent" required="true" rows="20" cols="50" placeholder="내용"/>
			<br><br>
			
			<input type="hidden" name="bCode" id="bCode" value="${ bCode }">
			<input type="submit" value="전송"/>
		</form:form>
<%-- 		<c:forEach items="${errors.fieldErrors}" var="err">
			<s:message code="${err.codes[0]}"  text="${err.field}: ${err.defaultMessage}" />;
		</c:forEach>
		<br><br><br>
		
		<c:forEach items="${errors.fieldErrors}" var="err">
			<s:message code="${err.codes[0]}"  text="${err.field}" />;
		</c:forEach> --%>
	</div>

</body>
</html>