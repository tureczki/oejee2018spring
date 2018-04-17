<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.tureczki.projectmico.ejbservice.domain.UserStub" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>User Data /\ Project mICO</title>
</head>
<body>
    <jsp:useBean id="userstub" class="org.tureczki.projectmico.ejbservice.domain.UserStub" scope="request" />
    	<h1>Email: <jsp:getProperty name="userstub" property="email" /></h1>
    <br/><br/>
    <br/><br/>
        <h1>Experience: <jsp:getProperty name="userstub" property="experience" /></h1>
    <br/><br/>
        <h1>Subscriber: <jsp:getProperty name="userstub" property="subscriber" /></h1>
    <br/><br/>
        <h1>Theme: <jsp:getProperty name="userstub" property="theme" /></h1>
    <br/><br/>
        <h1>Currency: <jsp:getProperty name="userstub" property="currency" /></h1>
    <br/><br/>
</body>
</html>