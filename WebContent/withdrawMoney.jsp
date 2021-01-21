<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");

if (session.getAttribute("email") == null) {
	response.sendRedirect("userLogin.jsp");

}
%>
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
form {
	border: solid 2px black;
	padding: 35px;
	margin-top: 20px;
}

form #hidden {
	padding: 0;
}

form p {
	padding: 10px 10px 10px 0px;
	margin-top: 10px;
}

form p input {
	display: inline-block;
	float: right;
	width: 240px;
	margin-left: 10px;
}

input[type=submit] {
	width: 30%;
	height: 10%;
	background-color: #00ff00;
	margin-left: 0;
	float: left;
}

#main-content .box h4 {
	padding-top: 20px;
}

#main-content {
	display: flex;
	justify-content: center;
	align-content: center;
	margin-top: 50px;
}

.box h1 {
	text-align: center;
}

/* CSS FOR FOOTER */
footer {
	width: 100%;
	padding: 10px 0px;
	background-color: black;
	color: white;
	text-align: center;
	display: inline-block;
	margin-top: 40px;
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
			<li><a href="userHome.jsp">Main Menu</a>
			<li><a href="Logout">Logout</a>
		</ul>
		<hr
			style="height: 4px; border-width: 0; color: gray; background-color: black">
	</nav>

	<div id="main-content">

		<div class="box">
			<h1 style="font-size: 35px; color: #009900;">Withdraw Money</h1>
			<form action="WithdrawlServ" method="post">
				<p>Current Balance ${user.balance}</p>
				<h4>Enter Withdrawl Details :</h4>
				<p>
					Id No. <input type="text" name="id" value="${user.id}">
				</p>
				<p>
					Full Name <input type="text" name="name" value="${user.name}">
				</p>
				<p id="hidden">
					<input type="hidden" name="balance" value="${user.balance} ">
				</p>
				<p>
					Withdraw Amount <input type="text" name="withdraw">
				</p>
				<p>
				<input type="submit" value="Withdraw Now">
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