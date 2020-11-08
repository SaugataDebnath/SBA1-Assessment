<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Loan Application</title>
</head>
<body>
	<!-- read the application number to edit from user and send to 
	     user controller to edit info
	-->
<h3>Edit Loan Application</h3>
<form>
<div>
			<div><label for="applicationNumber">Enter Application Number</label> </div>
			<div><input type="text" id="applicationNumber" name="applicationNumber"> </div>
</div>

        <br>
        <input type="submit" value = "Submit"/>
        <br/>
</form>

</body>
</html>