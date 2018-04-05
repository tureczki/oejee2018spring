<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.tureczki.projectmico.ejbservice.domain.InvestmentStub" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>Investment's details page - Project mICO</title>
</head>
<body>
    <jsp:useBean id="book" class="org.tureczki.projectmico.ejbservice.domain.InvestmentStub" scope="request" />
    <div><label>Investment ID: </label><span><jsp:getProperty name="investment" property="investment_id" /></span></div>
    <div><label>Investor ID: </label><span><jsp:getProperty name="investment" property="investor_id" /></span></div>
    <div><label>Invested amount: </label><span><jsp:getProperty name="investment" property="invested_amount" /></span></div>
    <div><label>Investment category: </label><span>${requestScope.investment.category.label}</span></div>
    <br/><br/>
</body>
</html>