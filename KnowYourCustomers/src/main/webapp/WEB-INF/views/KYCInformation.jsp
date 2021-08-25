<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1" import="com.kyc.entity.Kyc, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KYC Information</title>
    <script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>
<style>
body {
  margin: 0;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 25%;
  background-color: #f1f1f1;
  position: fixed;
  height: 100%;
  overflow: auto;
}

li a {
  display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
}

li a.active {
  background-color: #4CAF50;
  color: white;
}

li a:hover:not(.active) {
  background-color: #555;
  color: white;
}
</style>
<title>Profile</title>
<h1>
<a href="home">Home</a>
<a href="login">Logout</a>
<label>ABC BANK</label>
<label>Welcome Banker</label>
</h1>
</div>
<ul>
  <li><a href="profile">Customer Profile</a></li>
  <li><a class="active" href="KYCInformation">KYC Information</a></li>
  <li><Lable id="lblCustomerID">Customer ID </Lable></li>
  <li><Lable id="lblKycStatus">KYC Status</Lable></li>
</ul>
</head>
<% int KycCustId=(int)request.getAttribute("KycCustId"); System.out.println(KycCustId);%>
<div style="margin-left:25%;padding:1px 16px;height:1000px;">
<body>
<form action="savekyc" method="post">
<pre>
<input type="hidden" name="KycCustId" id="KycCustId" value="<%=KycCustId%>" />
<label>kycCountry</label><input type="text" name="kycCountry" id="kycCountry" />
<label>identificationType</label><input type="text" name="identificationType" id="identificationType" />
<label>identificationNumber</label><input type="text" name="identificationNumber" id="identificationNumber" />
<label>occupationType</label><input type="text" name="occupationType" id="occupationType" />
<label>designation</label><input type="text" name="designation" id="designation" />
<label>salary</label><input type="text" name="salary" id="salary" />
<input type="submit" name="login" id="save" />
</pre>
<div id="errMsg"></div>
</form>
</body>
</div>
</html>