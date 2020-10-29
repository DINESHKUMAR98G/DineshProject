<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
html{   
    background: url("https://images.pexels.com/photos/132197/pexels-photo-132197.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500") no-repeat center fixed;    
    background-size: cover;
}
.red {
	color: red;
	
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>
	<form:form action="${pageContext.request.contextPath}/register/process"
		modelAttribute="user">
	
	
		
		FirstName<form:input path="firstName"/>
		<span><form:errors path="firstName" cssClass="red"></form:errors></span>
		<br>
		<br>
		
		LastName<form:input path="lastName" />
		<span><form:errors path="lastName" cssClass="red"></form:errors></span>
		<br>
		<br>
		
		ContactNumber<form:input path="phoneNumber" />
		<span><form:errors path="phoneNumber" cssClass="red"></form:errors></span>
		<br>
		<br>
		
		VendorId<form:input path="vendorId" />
		<span><form:errors path="vendorId" cssClass="red"></form:errors></span>
		<br>
		<br>
		
		Password<form:input path="password" />
		<span><form:errors path="password" cssClass="red"></form:errors></span>
		<br>
		<br>

		<input type="submit" value="Submit">
	</form:form>
		
</body>
</html>