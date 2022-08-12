<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body >
<br>
<a href=HomePage.jsp style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>

<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
	if(user==null){
		response.sendRedirect("UserPage.jsp");
	}
%>
<div class="container">
	<div class="main-content">
		<p class="text">FlyAway BookTickets</p>
	</div>

		Payment via Card
		</p>
	</div>

	<div class="last-content">
		<button type="button" class="pay-now-btn">
		Credit Card
		</button>
		<button type="button" class="pay-now-btn">
		Debit Card
		</button>

		<!-- <button type="button" class="pay-now-btn">
		Netbanking options
		</button> -->
	</div>

	<div class="card-details">
		<p>Pay using Credit or Debit card</p>

		<div class="card-number">
		<label> Card Number </label>
		<input
			type="text"
			class="card-number-field"
			placeholder="###-###-###"/>
		</div>
		<br />
		<div class="date-number">
		<label> Expiry Date </label>
		<input type="text" class="date-number-field"
				placeholder="DD-MM-YY" />
		</div>

		<div class="cvv-number">
		<label> CVV number </label>
		<input type="password" class="cvv-number-field"
				placeholder="xxx" />
		</div>
		<div class="nameholder-number">
		<label> Card Holder name </label>
		<input
			type="text"
			class="card-name-field"
			placeholder="Enter your Name"/>
		</div>
		<button><a href="success.jsp">Pay Now</a></button>
	</div>
</body>
</html>