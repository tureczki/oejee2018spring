<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
    background-color: #00ffed;
}
table#t01 tr:nth-child(odd) {
   background-color: #00ffed;
}
table#t01 th {
    border: 1px solid white;
    background-color: black;
    color: white;
}
</style>

<table id="t01" style="width:100%">
  <tr>
    <th colspan="3">List of supported cryptocurrencies</th>
  </tr>
  <tr>
    <th>Name</th>
    <th>Unit/Code</th> 
    <th>Value in USD</th>
  </tr>
  <tr>
    <td>Bitcoin</td>
    <td>BTC</td>
    <td>8000</td>
  </tr>
  <tr>
    <td>Litecoin</td>
    <td>LTC</td>
    <td>137</td>
  </tr>
  <tr>
    <td>Dogecoin</td>
    <td>DOGE</td>
    <td>0.004242</td>
  </tr>
</table>


</body>
</html>