<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp"/>
	<h1 align="center">회원가입</h1>
	<form action="insert.me" method="post">
      <table align="center">
         <tr>
            <td> * 아이디 </td>
            <td><input type="text" name="mId" id="mId"></td>
            <td><button onclick="#">중복확인</button></td>
         </tr>
         <tr>
            <td> * 닉네임</td>
            <td><input type="text" name="nickName" id="nickName"></td>
            <td><button onclick="#">중복확인</button></td>
         </tr>
         <tr>
            <td> * 비밀번호 </td>
            <td><input type="password" name="mPwd"></td>
         </tr>
         <tr>
            <td> * 비밀번호확인 </td>
            <td><input type="password" name="userPwd2"></td>
         </tr>
         <tr>
            <td> 이메일 </td>
            <td><input type="email" name="email"></td>
            <td><button onclick="#">인증하기</button></td>
         </tr>
         
      </table>
      <br>
      <div align="center">
         <button type="reset">작성취소</button>
         <button type="submit">가입하기</button>
      </div>
   </form>
	
	
</body>
</html>