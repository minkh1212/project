<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ȸ�� Ż��</title>
<script type="text/javascript" src="../js/jquery-1.11.1.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<body>
<script type="text/javascript">
	swal({
	  title: "�˸�",
	  text: "ȸ��Ż�����",
	  icon: "error",
	  button: "Ȯ��"
	}).then((value)=>{
		location.href="./loginForm.jsp";
	});
</script>
</body>
</html>