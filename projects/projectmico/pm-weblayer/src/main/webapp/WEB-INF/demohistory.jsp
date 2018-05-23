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
  <li><a href="http://localhost:8080/projectmico/ticketclient">Client</a></li>
  <li><a href="http://localhost:8080/projectmico/ticketadmin">Admin</a></li>
</ul>

<div style="background-color:rgba(0, 165, 22,.5);;color:white;padding:20px;">
<h1 align="center">Order history</h1>
</div>
<div style="background-color:rgba(7, 4, 96,.5);color:white;padding:20px;">
<table id="t01" style="width:100%">
  <tr>
    <th colspan="7">Tickets</th>
  </tr>
  <tr>
    <th>Order ID</th>
    <th>E-mail</th>
    <th>Amount</th> 
    <th>Receive address</th>    
    <th>Message</th>
    <th>Date</th>
    <th>Status</th>
  </tr>
  <tr>
    <td>0</td>
    <td>tureczkibence@gmail.com</td>
    <td>9877</td>
    <td>rg4u34irz43iz3343443</td>    
    <td>Thank you in advance!</td>
    <td>2018.05.22</td>
    <td>Closed</td>
  </tr>
</table>
</div>

</body>
</html>