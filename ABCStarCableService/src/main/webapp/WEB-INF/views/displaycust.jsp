<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 >Customer Details</h1>
<table border="2" class="table">
  <tr >
     <th>Customer No.</th>
     <th>Base Pack</th>
     <th>Optional Pack</th>
	 <th>Action</th>
  </tr>
  <c:forEach var="p" items="${clist}">
     <tr>
       <td>${p.cno}</td>
       <td>${p.basepack}</td>
       <td>${p.optpack}</td>
       <td>
       		<a href="edit/${p.cno}">edit</a>
			/
			<a href="delete/${p.cno}">delete</a>
       </td>
     </tr>
  </c:forEach>
  
</table>
<a href="addcust">Add new Customer</a>
</body>
</html>