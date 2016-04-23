<%@include file="../global_imports/global.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Results</title>
<!-- 	<script type="text/javascript" src="./GlobalJS/global_js.js"></script> -->
</head>
<body>
	<div>
		<div>
			<div>First Name</div>
			<div>${user.firstName}</div>
		</div>
		<div>
			<div>Last Name</div>
			<div>${user.lastName}</div>
		</div>
		<div>
			<div>PassWord</div>
			<div>${user.passWord}</div>
		</div>
		<div>
			<div>Personal Details</div>
			<div>${user.details}</div>
		</div>
		<div>
			<div>Birth Date</div>
			<div>${user.birthDate}</div>
		</div>
		<div>
			<div>Gender</div>
			<div>${user.gender}</div>
		</div>
		<div>
			<div>Country</div>
			<div>${user.country}</div>
		</div>
		<div>
			<div>Smoking?</div>
			<div>${user.smoking}</div>
		</div>
	</div>
</body>
</html>