<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
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
  <li><a class="active" href="profile">Customer Profile</a></li>
  <li><a href="KYCInformation">KYC Information</a></li>
  <li><Lable id="lblCustomerID">Customer ID </Lable></li>
  <li><Lable id="lblKycStatus">KYC Status</Lable></li>
</ul>
</head>
<div>
<div style="margin-left:25%;padding:1px 16px;height:1000px;">
<body>
<form action="saveprofile" method="post">
<pre>
<label>firstName</label><input type="text" name="firstName" id="firstName" minlength="5" maxlength="12" onkeypress="return (event.charCode > 64 && 
	event.charCode < 91) || (event.charCode > 96 && event.charCode < 123)"/>
<label>mName</label><input type="text" name="mName" id="mName" minlength="5" maxlength="12" onkeypress="return (event.charCode > 64 && 
	event.charCode < 91) || (event.charCode > 96 && event.charCode < 123)"/>
<label>lastName</label><input type="text" name="lastName" id="lastName"minlength="5" maxlength="12" onkeypress="return (event.charCode > 64 && 
	event.charCode < 91) || (event.charCode > 96 && event.charCode < 123)" />
<label>gender</label><input type="radio" value="Male" name="gender" id="gender">Male</td><td><input type="radio" value="Female" name="gender" id="gender">Female</td></tr>
<label>dob</label><input type="text" name="dob" id="dob" onkeypress="return (event.charCode > 47 && 
	event.charCode < 58) || (event.charCode == 45)" minlength="10" maxlength="10" placeholder="MM-DD-YYYY">
<label>address</label><input type="text" name="address" id="address"minlength="5" maxlength="20"/>
<label>city</label><input type="text" name="city" id="city" minlength="6" maxlength="10" onkeypress="return (event.charCode > 64 && 
	event.charCode < 91) || (event.charCode > 96 && event.charCode < 123)"/>
<label>state</label><input type="text" name="state" id="state"  minlength="6" maxlength="10" onkeypress="return (event.charCode > 64 && 
	event.charCode < 91) || (event.charCode > 96 && event.charCode < 123)"/>
<label>country</label><select id="country" name ="country">
  <option value="India">India</option>
  <option value="Canada">Canada</option>
  <option value="USA">USA</option>
</select>
<label>postalCode</label><input type="text" name="postalCode" id="postalCode"  onkeypress="return (event.charCode > 47 && 
	event.charCode < 58)" minlength="6" maxlength="10"/>
<input type="submit" name="login" id="save" />
</pre>
<div id="errMsg"></div>
</form>
</body>
</div>
</html>