<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <link rel="stylesheet" href="css/style.css">
  <script type="text/javascript">
  function validateForm(form){
	  if(form.id.value == null){
		  alert("id를 입력해주세요 !")
		  form.id.focus();
		  return false;
	  }
	  if(form.pw.value == null){
		  alert("패스워드를 입력해주세요 !")
		  form.id.focus();
		  return false;
	  }
  }
  </script>
  
</head>
<body>
	<h2 class="title">로그인 페이지</h2>
	
	<div class="content">
		<form method="post" action="./login.lge" onsubmit="return validateForm(this);" >
			아이디 : <input class="form-control input_text" type="text" name="id" placeholder="id" > <br>
			비밀번호 : <input class="form-control input_text " type="password" name="pw" placeholder="pw"><br> 
			<a href="./signup.lge" class="btn btn-primary">회원가입</a>
			<input class="btn btn-primary" type="submit" value="로그인">
		</form>
	</div>
	
</body>
</html>