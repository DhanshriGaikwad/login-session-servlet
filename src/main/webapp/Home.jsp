<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String name=(String)session.getAttribute("name");
%>
<h2>Home Page:<%= name %></h2>

<a href="profile.jsp" >Home</a>&nbsp; &nbsp;
<a href="about-us.jsp">About-us</a>&nbsp; &nbsp;
<a href="logoutpage">Log-out</a>


</body>
</html>