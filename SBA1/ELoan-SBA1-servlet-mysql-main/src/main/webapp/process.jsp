<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Loan</title>
<script type="text/javascript">
        function show() { document.getElementById('area').style.display = 'block'; }
        function hide() { document.getElementById('area').style.display = 'none'; }
</script>
</head>
<body>
	<!-- write the code to read application number, and send it to admincontrollers
	     callemi method to calculate the emi and other details also provide links
	     to logout and admin home page
	-->	
<jsp:include page="header.jsp"/>
<div align="right"><a href="index.jsp">Logout</a></div>

<h2> Process Loan Applications: </h2>
<form action="placeloan" method = "post">
        <div>
			<div><label for="applicationNumber">Enter Application Number: </label> </div>
			<div><input type="text" id="applicationNumber" name="applicationNumber"> </div>
		</div>
		
		<button>Go</button>
</form>
<h5 style="background-color:powderblue;">Approver Remarks</h5>
<form action="placeloan" method = "post">

<br>
			<label>Sanctioned Loan Amount</label>	
			<input type ="text" name="sanctionLoanAmount"/>  
<br/>
<br>
<label for="approve_reject">Final Approval Indicator</label>
<p>
        <input type=radio name="approve_reject" value="a" onclick="show();"/>Approve        
</p>
<p>
<input type=radio name="approve_reject" value="b" onclick="show();"/>Reject
 <TEXTAREA id="area" style="display: none;" NAME="description" ROWS=10 COLS=50></TEXTAREA> 
</p>

<div>
			<div><input type="submit" value="Submit"> </div>
</div>

</form>
		

<br><br>
<a href="adminhome1.jsp">Return to Admin Home</a><br>
<br/><br/>
</body>
</html>