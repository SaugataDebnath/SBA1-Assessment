<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user home</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body>
	<!-- write the html code to display hyperlinks for user functionalities -->
	
<h4>Admin Dash Board</h4>
<div align="right"><a href="index.jsp">Logout</a></div>
<nav>
  <ul> 
    <br><li><a href="#">Apply For a Loan</a></li><br/>
    <br><li><a href="#">Track Loan</a></li><br/>
    <br><li><a href="#">Edit Your loan Application</a></li><br/>
  </ul>
</nav>
	
<jsp:include page="footer.jsp"/>

</body>
</html>