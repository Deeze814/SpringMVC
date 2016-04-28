<%@include file="../global_imports/global.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Results</title>
<!-- 	<script type="text/javascript" src="./GlobalJS/global_js.js"></script> -->
<style type="text/css">
	div > span{padding-right: 5%;}
</style>
</head>
<body>
	<div>
		<div>
			<span>First Name:</span>
			<span>${user.firstName}</span>
		</div>
		<div>
			<span>Last Name:</span>
			<span>${user.lastName}</span>
		</div>
		<div>
			<span>PassWord:</span>
			<span>${user.passWord}</span>
		</div>
		<div>
			<span>Personal Details:</span>
			<span>${user.detail}</span>
		</div>
		<div>
			<span>Birth Date:</span>
			<span>${user.birthDate}</span>
		</div>
		<div>
			<span>Gender:</span>
			<span>${user.gender}</span>
		</div>
		<div>
			<span>Country:</span>
			<span>${user.country}</span>
		</div>
		<div>
			<span>Smoking?</span>
			<span>${user.smoking}</span>
		</div>
	</div>
</body>
</html>