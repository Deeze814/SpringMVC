<%@include file="../global_imports/global.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<!-- 	<script type="text/javascript" src="./GlobalJS/global_js.js"></script> -->
</head>
<body>
	<div>
		<form:form modelAttribute="user" action="result.htm">
			<div>
				<div><form:label path="firstName">First Name</form:label></div>
				<div><form:input path="firstName" /></div>
			</div>
			<div>
				<div><form:label path="lastName">Last Name</form:label></div>
				<div><form:input path="lastName" /></div>
			</div>
			<div>
				<div><form:label path="passWord">PassWord</form:label></div>
				<div><form:password path="passWord"/></div>
			</div>
			<div>
				<div><form:label path="detail"/>Personal Details</div>
				<div><form:textarea path="detail"/></div>
			</div>
			<div>
				<div><form:label path="birthDate">Birth Date</form:label></div>
				<div><form:input path="birthDate"/></div>
			</div>
<%-- 			<div>
				<div><form:label path="gender">Gender</form:label></div>
				<div><form:radiobuttons path="gender" items="${genders}"/></div>
			</div> --%>
			<div>
				<div><form:label path="country">Country</form:label></div>
				<div><form:select path="country" items="${countries}"></form:select></div>
			</div>
			<div>
				<div><form:label path="smoking">Smoking?</form:label></div>
				<div><form:checkbox path="smoking"/></div>
			</div>
			<div>
				<input type="submit" value="Submit">
			</div>
		</form:form>	
	</div>
</body>
<html>