<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Application Form</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body onload="myFunction()">

<!--
	write the html code to accept laon info from user and send to place loan servlet
-->

<jsp:include page="header.jsp"/>
<div align="right"><a href="index.jsp">Logout</a></div>
<h3>Apply for a Loan</h3>

<form action="placeloan" method = "post">

        <br>
			<label>Loan Amount</label>	
			<input type ="text" name="LoanAmount"/>
		<br/>	
		<br><br/>
		    <label>Loan Application Number</label>
			<input type ="text" name ="applicationNumber"/>
		<br><br/>
		
		<br><br/>
		    <label>Application Date</label>
			<input type ="date" name ="applicationDate"/>
		<br><br/>
		<br>
			<label for="payment">Select Business Structure:</label>
			<select name="businessType" id="businessStructure">
			  <option value="type 0">Select..</option>
			  <option value="type 1">Individual</option>		
			  <option value="type 2">Organization</option>			
			</select>
		<br/>
<section>	
<h5 style="background-color:powderblue;">Financial Details</h5>
<div id="wrapper">
<label for="yes_no_radio">Are you salaried?</label>
<p>
<input type="radio" name="salaried_yes_no" >Yes</input>
</p>
<p>
<input type="radio" name="salaried_yes_no">No</input>
</p>
</div>


<div id="wrapper">
<label for="yes_no_radio">Are you a Tax payer?</label>
<p>
<input type="radio" name="tax_yes_no" >Yes</input>
</p>
<p>
<input type="radio" name="tax_yes_no">No</input>
</p>
</div>

</section>	
<section>
<h5 style="background-color:powderblue;">Contact Details</h5>

			<label>Address</label>	
			<input type ="text" name="address"/>
		
			<label style="margin-left: 4em">Contact Number(Mobile)</label>	
			<input type ="text" name="contactNumber"/>
		
			<label style="margin-left: 4em">Email</label>	
			<input type ="text" name="email"/>
			
</section>
        <br>
        <input type="submit" value = "Apply"/>
        <br/>
</form>  


<jsp:include page="footer.jsp"/>




</body>
</html>