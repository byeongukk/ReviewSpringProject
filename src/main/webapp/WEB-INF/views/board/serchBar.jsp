<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="searchArea" align="center">
	<label>검색조건</label>
	<select id="searchCondition" name="searchCondition">
		<option value="writer">작성자</option>
		<option value="title">제목</option>
		<option value="content">내용</option>
	</select>
	<input id="searchValue" type="search">
	<button onclick="searchBoard();">검색하기</button>
</div>
