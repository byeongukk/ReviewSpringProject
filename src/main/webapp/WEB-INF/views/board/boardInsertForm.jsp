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
	<h1 align="center">게시글 작성</h1>
	<hr>
	<div align="center">
	<label>제목</label>
		<input type="text" id="bTitle" name="bName" placeholder="제목">
		<br>
		<label >내용</label>
		<textarea rows="20" cols="50" id="bContent" name="bContent"></textarea>
		<button onclick="fn_insertBoard()">글작성</button>
	</div>
	
	<script>
		function fn_insertBoard(){
			$("#bTitle").val
			
			
			
		}
	</script>
</body>
</html>