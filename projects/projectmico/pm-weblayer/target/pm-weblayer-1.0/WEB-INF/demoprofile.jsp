<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>Demo profile /\ Project mICO</title>
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
  <li><a href="http://localhost:8080/projectmico/ticketclient">Client</a></li>
  <li><a href="http://localhost:8080/projectmico/ticketadmin">Admin</a></li>
</ul>

<div style="background-color:rgba(0, 165, 22,.5);color:white;padding:20px;">
<h1 align="center">Profile</h1>
</div>

<div style="background-color:rgba(7, 4, 96,.5);color:white;padding:20px;">
<div>Account information</div>
<div>Email: bence.tureczki@gmail.com</div>
<div>mICO balance: 1500</div>
<div>Balance in USD: 10000</div>
</div>

<div style="background-color:rgba(0, 165, 22,.5);color:white;padding:20px;">
<div>Public profile</div>
<div>Username: bence.tureczki</div>
<div>Description: Hi! I am a full-time student at Óbuda University. I have passion for learning J2EE development. I see great potential in Project mICO.</div>
</div>

<form>
<div style="background-color:rgba(7, 4, 96,.5);color:white;padding:20px;">
   I would like to buy <input style="color:black;" type="text" name="mico"> mICO<br><br>
       <input style="color:black;" type="submit" value="Go to payment page!">
</div>
</form>

</body>
</html>