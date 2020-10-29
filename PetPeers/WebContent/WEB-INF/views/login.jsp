<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
html{   
    background: url("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQuIlFi_tVMRuaofI7Eo-CPL9ujbmRw15-o9A&usqp=CAU") no-repeat center fixed;    
    background-size: cover;
}
.red{
color: blue;
}
</style>

</head>
<body>
<form:form
		action="${pageContext.request.contextPath}/login/processlogin" modelAttribute="user">
		
	
        VendorId:<form:input path="vendorId" />
		<span><form:errors path="vendorId" cssClass="red"></form:errors></span>
		<br>
		
		
		Password:<form:input path="password" />
		<span><form:errors path="password" cssClass="red"></form:errors></span>
		<br>
		<br>
		<input type="submit" value="Login">


	</form:form>
</body>
</html>