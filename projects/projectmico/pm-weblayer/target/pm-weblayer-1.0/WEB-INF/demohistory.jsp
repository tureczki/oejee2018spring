<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>History /\ Project mICO</title>
</head>
<body background=<%=request.getContextPath()%>/img/background.jpg>

<style>
table, th, td {
    border: 1px solid black;
    padding: 15px;
    border-collapse: collapse;
}
table#t01 tr:nth-child(even) {
   background-color: rgb(119, 227, 255, .5);
}
table#t01 tr:nth-child(odd) {
   background-color: rgb(119, 227, 255, .5);
}
table#t01 th {
    border: 1px solid white;
    background-color: #333333;
    color: white;
}
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
<h1 align="center">Order history</h1>
</div>
<div style="background-color:rgba(7, 4, 96,.5);color:white;padding:20px;">

<%
String address = "3QJmV3qfvL9SuYo34YihAf3sRCW3qSinyC"; 
if(request.getParameter("basecurrency") == null){ address = "Not known"; }
%>

<table id="t01" style="width:100%">
  <tr>
    <th colspan="7">Tickets</th>
  </tr>
  <tr>
    <th>Id</th>
    <th>E-mail</th>
    <th>Product name</th> 
    <th>Date</th>    
    <th>Amount</th>
    <th>Price</th>
    <th>Currency name</th>
  </tr>
  <tr>
    <td><%=request.getAttribute("id")%></td>
    <td><%=request.getAttribute("email")%></td>
    <td><%=request.getAttribute("productname")%></td> 
    <td><%=request.getAttribute("date")%></td>    
    <td><%=request.getAttribute("amount")%></td>
    <td><%=request.getAttribute("price")%></td>
    <td><%=request.getAttribute("currencyname")%></td>
  </tr>
</table>
</div>

</body>
</html>