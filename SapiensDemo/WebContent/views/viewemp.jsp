<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "spr"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/loginstyle.css" rel="stylesheet" type="text/css">
<style type="text/css">table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}</style>
<title>Insert title here</title>
</head>
<body>
<table border="1">
<c:forEach items="${emplist}" var="e">
<%-- <td>${emp1}</td> --%>
<tr>
<c:forEach items="${e}" var="e1">
<td>${e1}</td>



</c:forEach>
<td><a href="/SapiensDemo/update/${e[0]}">Update</a></td>
<td><a href="/SapiensDemo/delete/${e[0]}">Delete</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>