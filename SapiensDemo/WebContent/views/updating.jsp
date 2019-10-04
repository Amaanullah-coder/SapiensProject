<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spr:form method = "POST" modelAttribute="updata" action = "/SapiensDemo/updateDone">

        <spr:input type="text" path = "firstName" placeholder= "FirstName"></spr:input>
        <spr:input type="text" path = "lastName" placeholder= "LasttName"></spr:input>
        <spr:input type="text" path = "age" placeholder="Age"></spr:input>  
        <spr:input type="hidden" path="id"/> 
       <%--  <spr:input type="text" path= "presentAddress" placeholder= "address"></spr:input>  --%>
        <input type = "submit" value = "Submit">
      </spr:form>
</body>
</html>