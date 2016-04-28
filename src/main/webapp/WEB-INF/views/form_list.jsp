<%@include file="../global_imports/global.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<!-- 	<script type="text/javascript" src="./GlobalJS/global_js.js"></script> -->
<style type="text/css">
	.fieldError{background-color: #FFC;}
</style>
</head>
<body>
	<div>
		<form:form modelAttribute="user" action="result.htm" method="POST">
		<table>
			<tr>
				<td><form:label path="firstName">First Name</form:label></td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="passWord">PassWord</form:label></td>
				<td><form:password path="passWord"/></td>
				<td><form:errors path="passWord"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email"/></td>
				<td><form:errors path="email"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="birthDate">Birth Date</form:label></td>
				<td><form:input path="birthDate"/></td>
				<td><form:errors path="birthDate"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="gender">Gender</form:label></td>
				<td><form:radiobuttons path="gender" items="${genders}"/></td>
			</tr>
			<tr>
				<td><form:label path="country">Country</form:label></td>
				<td><form:select path="country" items="${countries}"></form:select></td>
			</tr>
			<tr>
				<td><form:label path="smoking">Smoking?</form:label></td>
				<td><form:checkbox path="smoking"/></td>
			</tr>
			<tr>
				<td><form:label path="detail"/>Personal Details</td>
				<td><form:textarea path="detail"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>			
		</form:form>	
	</div>
</body>
<html>