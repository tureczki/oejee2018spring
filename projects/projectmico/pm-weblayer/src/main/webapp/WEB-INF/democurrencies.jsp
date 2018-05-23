<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>Cryptocurrencies /\ Project mICO</title>
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

<table id="t01" style="width:100%">
  <tr>
    <th colspan="3" style="background-color:rgba(7, 4, 96,.5);">List of supported cryptocurrencies</th>
  </tr>
    <tr>
    <th>Name</th>
    <th>Unit/Code</th> 
    <th>Value in USD</th>
  </tr>
  <% 
   
  ArrayList<String> listofcurrencies = (ArrayList<String>) request.getAttribute("listofcurrencies");
  for (int i=0; i<listofcurrencies.size() - 2; i = i + 3) {
  	String name = listofcurrencies.get(i);
  	String unitcode = listofcurrencies.get(i+1);
  	String valueinusd = listofcurrencies.get(i+2);
  %>
  <tr>
    <td><%=name%></th>
    <td><%=unitcode%></th> 
    <td><%=valueinusd%></th>
  </tr>
  <% } %>
</table>



</body>
</html>