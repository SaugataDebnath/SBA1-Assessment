<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User Registration</title>
</head>
<body>
	<!-- read user name and password from user to create account
	     and send to usercontrollers registeruser method
	-->
	
<jsp:include page="header.jsp"/>
	
<form action="user?action=registernewuser" method="post">

<div>
<br>
			<label style="margin-left: 4em">First Name</label>	
			<input type ="text" name="firstName"/>
<br/>
</div>
<div>
<br>
			<label style="margin-left: 4em">Last Name</label>	
			<input type ="text" name="lastName"/>
<br/>
</div>

         <div><br>
			<label style="margin-left: 4em" for="gender">Select Gender:</label>
			<select name="gender" id="gender">
			  <option value="gender">Select..</option>
			  <option value="male">Female</option>		
			  <option value="female2">Male</option>			
			</select>
		<br/></div>
<div>
<br>
			<label style="margin-left: 4em">Enter Address</label>	
			<input type ="text" name="address"/>
<br/>
</div>

<div><br>
			<label style="margin-left: 4em">Select Username</label>	
			<input type ="text" name="username"/>
<br/>
</div>
<br>		
			<label style="margin-left: 4em">Enter Password</label>	
			<input type ="text" name="password"/>
<br/>
		

<br>
        <div>
			<div><input style="margin-left: 16em" type="submit" value="Register"> </div>
		</div>
<br/>
</form>
<jsp:include page="footer.jsp"/>

</body>
</html>