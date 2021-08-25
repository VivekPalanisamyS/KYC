<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Login</title>
 <script type="text/javascript"  src="/KnowYourCustomers/Js/test.js"></script>
</head>
<h1>Sign In</h1>
<body>
<form action="header1" method="post" onsubmit="return validate()">
		<pre>
<label>User Name</label><input type="text" name="userName" id="userName" />
<label>Password</label><input type="password" name="password"
				id="password" />
<input type="submit" name="login" id="login" />
</pre>
<div id="errMsg"></div>
</form>
</body>
</html>