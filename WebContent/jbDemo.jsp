<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Java Bean Demo</h1>
<hr>
<h2>
<jsp:useBean id="p1" class="com.controller.Person"></jsp:useBean>b v
<jsp:setProperty property="name" name="p1" value="Keshu"/>
<jsp:setProperty property="age" name="p1" value="25"/>
Your good name is <jsp:getProperty property="name" name="p1"/><br>
Your age is <jsp:getProperty property="age" name="p1"/>
<hr>
<% 
com.controller.Person p2=new com.controller.Person();
p2.setName("Sang");
p2.setAge(22);
out.println("Name : "+p2.getName());
out.println("Age: " +p2.getAge());
%>
</h2>
</body>
</html>