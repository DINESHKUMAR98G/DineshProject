<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<style>
html{
 background: url(" background: url("https://media.istockphoto.com/vectors/online-pets-care-services-tiny-girl-with-dog-and-cat-pet-shop-modern-vector-id1205007179") no-repeat center fixed;    
    background-size: cover;") no-repeat center fixed;    
    background-size: cover;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/pet/process"
		modelAttribute="petdetails">
	Age<form:input path="petAge" />
		<span><form:errors path="petAge" cssClass="red"></form:errors></span>
		<br>
		
		PetType<select name="petType">
			<option value="Labordor">Labordor</option>
			<option value="goldenretriever">GoldenRetriver</option>
			<option value="siberianhusky">SiberianHusky</option>
			<option value="boxer">Boxer</option>
			<option value="pug">pug</option>
			<option value="persiancat">PersianCat</option>
			<option value="himalayancat">HimalayanCat</option><br>
			<input type="button" value="BUY">	
		</select>
	</form:form>
</body>
</html>