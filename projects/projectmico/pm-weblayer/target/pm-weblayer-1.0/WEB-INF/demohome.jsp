<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>Home /\ Project mICO</title>
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

<div style="background-color:rgba(0, 165, 22,.5);;color:white;padding:20px;">
<h1 align="center">Project mICO demo</h1>
<h2 align="center">Tureczki Bence</h2>
</div>

<div style="background-color:rgba(7, 4, 96,.5);;color:white;padding:20px;">
  <h2>Initial Coin Offering (ICO)</h2>
  <p>Definition:<p>
  <p>An unregulated means by which funds are raised for a new cryptocurrency venture. An Initial Coin Offering (ICO) is used by startups to bypass the rigorous and regulated capital-raising process required by venture capitalists or banks. In an ICO campaign, a percentage of the cryptocurrency is sold to early backers of the project in exchange for legal tender or other cryptocurrencies, but usually for Bitcoin.</p>
  <p>Source: https://www.investopedia.com/terms/i/initial-coin-offering-ico.asp (2018.05.21.)</p>
</div>

<div style="background-color:#333333;;color:white;padding:20px;">
<h2 align="center">Table of content</h2>
</div>

<ul>
  <li><a href="http://localhost:8080/projectmico/demohome">Demo home</a></li>
  <li><a href="http://localhost:8080/projectmico/listcurrencies">Cryptocurrencies</a></li>
</ul>


</body>
</html>