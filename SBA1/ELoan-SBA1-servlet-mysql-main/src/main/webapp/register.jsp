<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Screen</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>
<div align=center>
	<h2>eLoan Login</h2>
	<form action="registerNewUser" method="post">
	
	
		<div>
			<div><label for="loginid">Select login Id</label> </div>
			<input type="text" id="loginid" name="loginid">
		</div>
		<div>
			<div><label for="password">Enter password</label> </div>
			<div><input type="text" id="password" name="password"> </div>
		</div>
		<div>
			<div><input type="submit" value="Register"> </div>
		</div>
		<a action="user?action=registerNewUser" href="newuserui.jsp">New User? register here</a>
	</form>
	</div>
	
<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>