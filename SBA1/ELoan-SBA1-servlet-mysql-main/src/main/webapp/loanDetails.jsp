<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View your Loan Details</title>
</head>
<body>
	<!-- write the code to display the loan status information 
	     received from usercontrollers' displaystatus method
	-->

<form action="" method="post">
<div>
			<div><label for="applicationNumber">Enter Application Number</label> </div>
			<div><input type="text" id="applicationNumber" name="applicationNumber"> </div>
</div>

        <br>
        <input type="submit" value = "Submit"/>
        <br/>
</form>

<br>
<label for="file">Diplaying Loan Progress:</label>
<progress id="loanStatus" value="5" max="100"> Your Progress </progress>

<jsp:include page="footer.jsp"/>
</body>
</html>