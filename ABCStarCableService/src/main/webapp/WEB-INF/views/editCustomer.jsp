<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- <form action="/SpringMVCCCRUDDemo/product/updateProduct" method="post"> -->
	<form action="updateCustomer" method="post">
        Enter Customer No :<input type="text", name="cno", id="c1" value="${c.cno}" readonly/>
		Enter Base Pack :<input type="text", name="basepack", id="c2" value="${c.basepack}" />
		Enter Order Pack :<input type="text", name="optpack", id="c2" value="${c.optback}"/>
         <button type="submit" name="btn" id="btn">update Customer</button>
   </form>
</body>
</html>