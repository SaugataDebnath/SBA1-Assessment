<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate Loan EMI</title>
</head>
<body>
<jsp:include page="header.jsp"/>
 <!--
     Read the values from the admin servlet and cal emi and other details and send to
     to the same admin servlet to update the values in the database 
  --> 
<h3>Calculate EMI</h3> 

<form action="" method = "get">
<br/>
<label>Enter Loan Number</label>
<br/>
<input type="text" name="loanNumber" />


        <br>
			<label>Sanctioned Loan Amount</label>	
			<input type ="text" name="sanctionLoanAmount"/>  
		<br/>	
		<br>
			<label>Term</label>	
			<input type ="text" name="termDuration"/>  
		<br/>

<br>		
<label for="startDate">Loan Start Date:</label>
<input type="date" id="birthday" name="startDate">


<div>	
<input type="submit" value = "Calculate"/>
</div>	

<br>
<label for="monthlyEMI">Monthly EMI:</label>
<input type="date" id="birthday" name="startDate">



</form>
<jsp:include page="footer.jsp"/>
</body>
</html>