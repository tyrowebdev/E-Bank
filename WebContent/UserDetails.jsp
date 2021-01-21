<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");

if (session.getAttribute("email") == null) {
	response.sendRedirect("userLogin.jsp");

}
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	font-size: 3vw;
	text-align: center;
}

.box {
	background-color: #80ff80;
	margin-top: 20px;
	width:100%;
	display: block;
	padding: 50px;
	text-align: center;
	border: 2px solid black;
}

#main-content ul li {
	padding: 10px;
	text-align: center;
}

#main-content ul li a {
	text-decoration: none;
	color: black;
	font-size: 18px;
	font-weight: bold;
	padding: 10px;
}

#main-content ul li a:hover {
	background-color: white;
}





.box table, td, th {
	border: 1px solid black;
	padding: 5px;
}

#main-content .box  table {
	border-collapse: collapse;
	width: 100%;
	margin-top: 20px;
}

#main-content #options {
	background-color: #f2f2f2;
	margin-top: 50px;
}

#main-content #options li {
	padding: 20px;
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
			<li><a href="userHome.jsp">Main Menu</a>
			<li><a href="Logout">Logout</a>
		</ul>
		<hr
			style="height: 4px; border-width: 0; color: gray; background-color: black">
	</nav>

	<div id="main-content">
			<div id="options">
				
<h1>Welcome To E-Bank, ${user.name} !</h1>
		<div class="box">
			<h3>Your Account Details :</h3>
			<table>
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>E-mail</th>
						<th>Password</th>
						<th>Address</th>
						<th>Contact</th>
						<th>Balance</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><c:out value="${user.id}"></c:out></td>
						<td><c:out value="${user.name}"></c:out></td>
						<td><c:out value="${user.email}"></c:out></td>
						<td><c:out value="${user.password}"></c:out></td>
						<td><c:out value="${user.address}"></c:out></td>
						<td><c:out value="${user.contact}"></c:out></td>
						<td><c:out value="${user.balance}"></c:out></td>
					</tr>
				</tbody>
			</table></div>
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

