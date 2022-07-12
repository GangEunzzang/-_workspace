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
  <link rel="stylesheet" href="../css/style.css">
  
<script type="text/javascript">
	function validateForm(form) {
		if(form.id.value == ""){
			alert("id를 입력하세요.");
			form.id.focus();
			return false;
		}
		if(form.pw.value == ""){
			alert("비밀번호 입력하세요 !");
			form.pw.focus();
			return false;
		}
		if(form.name.value == ""){
			alert("이름을 입력하세요 !");
			form.name.focus();
			return false;
		}
		if(form.email.value == "" ){
			alert("이메일을 입력하세요 ! ");
			form.email.focus();
			return false;
		}
		else{
			alert("회원가입이 완료되었습니다.");
		}
	}
</script>
</head>
<body>
	
	<h2 class="title">회원 가입 페이지</h2>
	
<div class="content">	
	<form method="post" action="./signup.lge" onsubmit="return validateForm(this);">
		아이디 : <input class="form-control input_text" type="text" name="id" placeholder="id" > <br>
		비밀번호 : <input class="form-control" type="password" name="pw" placeholder="pw"><br> 
		이름 : <input class="form-control" type ="text" name="name" placeholder="이름"> <br>	
		이메일 :<input class="form-control" type="text" name="email" placeholder="이메일"> <br> 
		<input class ="btn btn-primary" type="submit" value="회원가입">
	</form>
</div>
</body>
</html>