<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
	<form action="login_submit" method="post">
		<div>
			<label>用户名:</label>
			<input type="text" name="username"/>
		</div>
		<div>
			<label>密&nbsp;码:</label>
			<input type="text" name="password"/>
		</div>
		<input type="submit" value="提交"/>
	</form>
	${message}
</body>
</html>