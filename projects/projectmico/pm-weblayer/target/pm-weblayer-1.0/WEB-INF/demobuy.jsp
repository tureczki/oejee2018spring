<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>Buy /\ Project mICO</title>
</head>
<body background=<%=request.getContextPath()%>/img/background.jpg>

<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111111;
}
</style>

<ul>
  <li><a href="http://localhost:8080/projectmico/demohome">Home</a></li>
  <li><a href="http://localhost:8080/projectmico/democurrencies">Cryptocurrencies</a></li>
  <li><a href="http://localhost:8080/projectmico/profile">Profile</a></li>
  <li><a href="http://localhost:8080/projectmico/buy">Buy</a></li>
  <li><a href="http://localhost:8080/projectmico/history">History</a></li>
  <li><a href="http://localhost:8080/projectmico/ticketclient">Purchases</a></li>
</ul>

<div style="background-color:rgba(0, 165, 22,.5);;color:white;padding:20px;">
<h1 align="center">Buy mICO</h1>
</div>

<%
String mico = "0";
if (request.getParameter("name") != null) {
	mico = String.valueOf(Double.parseDouble(request.getParameter("mico"))*0.0001);
	}  %>
	
<%
String basecurrency = "BTC";
if (request.getParameter("basecurrency") != null) {
	mico = String.valueOf(Double.parseDouble(request.getParameter("mico"))*0.0001);
	}  %>

<form action = "http://localhost:8080/projectmico/history" method="GET">
<div style="background-color:rgba(7, 4, 96,.5);color:white;padding:20px;">
   <input type="hidden" name="basecurrency" value="<%=basecurrency%>">
   Please, send "<%=mico%>" <%=basecurrency%> to the address: 3QJmV3qfvL9SuYo34YihAf3sRCW3qSinyC<br>
   When you are done, connect an e-mail address to the order!<br><br>
   E-mail: <input style="color:black;" type="text" name="email"><br><br>
   Custom comment (e.g.: paid low fee, expect long transaction time):<br><br>
  <input type="textarea" name="message" style="color:black;" rows="4" cols="50" />
  <input style="color:black;" type="submit" value="I sent the payment">
</form>

</div>

</body>
</html>