<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- write html code to read the application number and send to user controllers'
             display status method for displaying the information
	-->
	
	<h4>Check Your Loan Status</h4>
        <form action="user?action=trackloan" method="post"> 
        <br>
			<label>Enter your Loan Number</label>	
			<input type ="text" name="loanNumber"/>   
			<button type="submit">Go</button>
		<br/>	
		</form>
<jsp:include page="footer.jsp"/>


</body>
</html>