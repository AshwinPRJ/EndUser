<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="<spring:url value="/resources/javascript/home.js" />"></script>
</head>
<body
	style="background-image: url('/resources/image/Supermarket1.jpg'); background-repeat: no-repeat;">
	<div align="center">
		<img src="/resources/image/GrahakLogo.jpg" />
	</div>
	<div class="container" align="center">
		<ul class="pagination">

			<li class="active">
				<button type="button" id = "home" class="btn btn-primary">Home</button>
			</li>
			<li class="btn btn-link">
				<button type="button" id = "admin" class="btn btn-secondary">Admin Login</button>
			</li>
			<li>
				<button type="button" id = "shopy" class="btn btn-success">Shopy Login</button>
			</li>
			<li><button type="button" id = "product" class="btn btn-danger">Product List</button></li>


		<!-- 	<li class="active"><a href="">Home</a></li>
			<li class="btn btn-link"><a href="views/AdminLogin.jsp">Admin Login</a></li>
			<li><a href="views/CustomerLogin.jsp">Shopy Login</a></li>
			<li><a href="views/ProductListDisplay.jsp">Product List</a></li> -->
			<!-- <li><a href="reports/RptUserTransaction.jsp">Users Transaction Report</a></li> -->
		</ul>
	</div>
</body>
</html>