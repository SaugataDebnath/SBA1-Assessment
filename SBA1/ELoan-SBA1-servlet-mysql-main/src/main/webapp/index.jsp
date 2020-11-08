<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>eLoan system</title>
</head>
<body>
	<!-- write the html code to read user credentials and send it to validateservlet
	    to validate and user servlet's registernewuser method if create new user
	    account is selected
	-->

<hr/>
<h2> Login Here...</h2>
<form action="Login" method = "get">
<label for="relation">Select Relation:</label>
<select name="relation" id="relation">
			  <option value="Admin">Admin</option>		
			  <option value="User">User</option>			
</select>
<br/>
<label>Enter login Id</label>
<br/>
<input type="text" name="logid" />
<br/><br/>
<label>Enter password</label>
<br/>
<input type="password" name="password" />
<br/><br/>
<input type="submit" value = "login"/>
</form>
	
	

</body>
</html>