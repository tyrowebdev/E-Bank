<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.E-Bank.com</title>
<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

body {
	background-color: #f2f2f2;
}

/* CSS FOR HEADING */
#heading {
	text-align: center;
	font-weight: bolder;
	font-size: 5vw;
	background-color: #00bfff;
	padding: 25px 0;
}

nav ul {
	text-decoration: none;
	background-color: #00bfff;
	padding: 15px;
	display: flex;
	justify-content: flex-end;
}

li {
	list-style-type: none;
}

nav>ul>li>a:hover {
	background-color: #f3f3f3;
}

nav ul li a {
	text-decoration: none;
	padding: 10px 20px;
	color: black;
	cursor: pointer;
}

ul>li>ul {
	display: none;
	position: absolute;
	margin-top: 3px;
	cursor: pointer;
}

ul>li>ul>li {
	text-align: center;
	margin: 1px 0px;
}

ul>li:hover>ul {
	display: block;
}

ul>li>ul>li>a {
	padding: 1px 3px 1px 1px;
}

ul>li>ul>li>a:hover {
	background-color: #f3f3f3;
}

/* CCS FOR BODY */
#main-content h1 {
	padding-top: 50px;
	text-align: center;
	color: #009900;
	font-size: 4vw;
	text-align: center;
}

.box {
	width: 100%;
	display: flex;
	flex-direction: row;
	margin-top: 50px;
}

.box .tab {
	width: 50%;
}

.box>.tab>img {
	width: 50%;
	display: block;
	margin-left: auto;
	margin-right: auto;
}

form {
	border: solid 2px black;
	padding: 35px;
	padding-top: 15px;
}

form h3 {
	margin-bottom: 30px;
}

form input {
	margin-left: 10px;
	display: inline-block;
	float: right;
}

form p {
	padding: 10px;
}

input[type=submit] {
	width: 30%;
	height: 10%;
	background-color: #00ff00;
	margin-left: 0;
	float: left;
}

/* CSS FOR FOOTER */
footer {
	width: 100%;
	padding: 10px 0px;
	background-color: black;
	color: white;
	text-align: center;
	position: absolute;
	bottom: 0;
}

footer a {
	text-decoration: none;
	color: white;
}

footer a:hover {
	background-color: black;
}
</style>
</head>

<body>

	<nav>
		<div id="heading">E-Bank</div>
		<hr
			style="height: 4px; border-width: 0; color: gray; background-color: black">

		<ul>
			<li><a href="index.jsp">Home</a></li>
			<li><a>Login</a>
				<ul>
					<li><a href="userLogin.jsp">User</a></li>
					<li><a href="adminLogin.jsp">Admin</a></li>
				</ul></li>
			<li><a href="signUP.jsp">SignUp</a></li>
			<li><a href="services.jsp">Services</a></li>
			<li><a href="about.jsp">About</a></li>
		</ul>
		<hr
			style="height: 4px; border-width: 0; color: gray; background-color: black">
	</nav>

	<div id="main-content">

		<h1>Welcome To E-Bank, Admin !</h1>
		<div class="box">
			<div class="tab">
				<img src="images/signin.jfif" height="200px">
			</div>


			<form action="Login" method="post">
				<h3>Login To Your Account</h3>
				<p>
					Enter Admin E-mail<input type="text" name="email">
				</p>
				<p>
					Enter Password<input type="password" name="password">
				</p>
				<p>
					<input type="submit" value="Login">
				</p>
			</form>
		</div>
	</div>

	<footer>
		<p>
			© 2021 MD.TOUSIF RAJJA . All Rights Reserved.<br> <a
				href="mailto:mtr7867@gmail.com">mtr7867@gmail.com</a>
		</p>
	</footer>


</body>
</html>