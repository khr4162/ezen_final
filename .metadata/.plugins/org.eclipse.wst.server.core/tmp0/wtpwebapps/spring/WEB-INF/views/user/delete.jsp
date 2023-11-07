<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/user/login.css">
</head>
<body>
   <form action="/user/delete" method="post">
        <div class="form-group">
            <input type="text" class="form-control" name="cid" id="exampleFormControlInput1" placeholder=" ">
            <label for="exampleFormControlInput1" class="form-label">Please Enter your ID</label>
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="cpw" id="exampleFormControlInput2" placeholder=" ">
            <label for="exampleFormControlInput2" class="form-label">Please Enter your PW</label>
        </div>
        <button type="submit" class="btn btn-dark">회원탈퇴</button>
    </form>
   
   <script type="text/javascript">
       const deleteFail = '<c:out value="${deleteFail}"/>';
       console.log(deleteFail); 
      
       if(deleteFail == 1){
           alert("아이디 혹은 비밀번호를 확인해주세요")   
       }
       
   </script>
</body>
</html>