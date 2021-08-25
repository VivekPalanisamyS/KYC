<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.kyc.entity.Kyc, java.util.List" %>
<!DOCTYPE html>
<html>
<script
  src="https://code.jquery.com/jquery-3.5.1.min.js"
  integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
  crossorigin="anonymous"></script>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<h1>
<a href="home">Home</a>
<a href="login">Logout</a>
<label>ABC BANK</label>
<label>Welcome Banker</label>
</h1>
</head>
<body>
<a href="profile">Create New Customer</a>
<%List<Kyc> Kyc=(List<Kyc>)request.getAttribute("Kyc");
for(Kyc e:Kyc)
{out.println(e.getCustId());
out.println(e.getFirstName());
out.println(e.getSalary());} %>
</body>
</html>