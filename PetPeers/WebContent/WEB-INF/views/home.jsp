<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
html{   
    background: url("https://media.istockphoto.com/vectors/online-pets-care-services-tiny-girl-with-dog-and-cat-pet-shop-modern-vector-id1205007179") no-repeat center fixed;    
    background-size: cover;
}

</style>

<title>Insert title here</title>
</head>
<body>
<h1>PetPeer Application System</h1>
<a href="${pageContext.request.contextPath}/register/form">User
		Registration</a><br>
		<a href="${pageContext.request.contextPath}/login/form">User Login</a><br>
				<a href="${pageContext.request.contextPath}/pet/form">Buy Pet</a><br>
		
</body>
</html>