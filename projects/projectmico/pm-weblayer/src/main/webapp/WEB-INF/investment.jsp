<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.tureczki.projectmico.ejbservice.domain.TesztadatStub" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>Tesztadat - Project mICO</title>
</head>
<body>
    <jsp:useBean id="tesztadat" class="org.tureczki.projectmico.ejbservice.domain.TesztadatStub" scope="request" />
    <h1><jsp:getProperty name="tesztadat" property="azonosito" /></h1>
    <br/><br/>
</body>
</html>