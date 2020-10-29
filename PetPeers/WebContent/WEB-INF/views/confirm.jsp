<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<h1>User Registration Successful</h1>
	<h3>The First name is ${user.firstName}</h3>
	<h3>The Last name is ${user.lastName}</h3>
	<h3>The Contact number is ${user.phoneNumber}</h3>
	<h3>The Vendor id is ${user.vendorId}</h3>
	
	
	<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>