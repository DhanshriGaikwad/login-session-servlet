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
<h2>About Page<%= name %></h2>
<h4>contact:8669492710</h4>

<a href="profile.jsp" >Home</a>&nbsp; &nbsp;
<a href="Home.jsp">About-us</a>&nbsp; &nbsp;
<a href="logoutpage">Log-out</a>

</body>
</html>