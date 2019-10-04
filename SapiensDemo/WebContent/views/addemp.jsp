<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
  <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "spr"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<spr:form method = "POST" modelAttribute="emp" action = "/SapiensDemo/registeremp">

    <p>FirstName<spr:input type="text" path = "firstName" placeholder= "FirstName"></spr:input></p>
      <p>LastName<spr:input type="text" path = "lastName" placeholder= "LasttName"></spr:input></p>
         <p>Age<spr:input type="text" path = "age" placeholder="Age"></spr:input></p>   
         <p>Address<spr:input type="text" path= "presentAddress" placeholder= "address"></spr:input></p> 
         <p>Status<spr:input type="text" path= "status" placeholder= "status"></spr:input></p>
         <p>Duration<spr:input type="text" path="duration" placeholder="duration"></spr:input></p>
         <p>ProjectName<spr:input type="text" path="projectname" placeholder="ProjectName"></spr:input></p>
         <p><input type = "submit" value = "Submit"></p>
      </spr:form>
</body>
</html>