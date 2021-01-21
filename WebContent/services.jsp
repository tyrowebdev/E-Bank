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
.container {
	width: 100%;
	height: auto;
	display: flex;
	flex-direction: row;
}

.box {
	margin: 30px;
	padding: 50px;
	overflow: hidden;
	width: 50%;
	flex-wrap: wrap;
	border: solid 2px black;
	background-color: #f2f2f2;
}

.container .box img {
	margin-left: auto;
	margin-right: auto;
	width: 30%;
	display: block;
}

.box figcaption h3 {
	text-align: center;
	padding: 10px 0px;
	background-color: grey;
	margin-top: 15px;
}

.box figcaption p {
	background-color: #cccccc;
	padding: 10px;
	line-height: 1.5;
}

/* RESPONSIVE BODY */
@media all and (max-width:900px) {

.container {
	width: 100%;
	height: auto;
	display: block;
}
.box {

	width: 90%;
	border: solid 2px black;
	background-color: #f2f2f2;
}
}

/* CSS FOR FOOTER */
footer {
	width: 100%;
	padding: 10px 0px;
	background-color: black;
	color: white;
	text-align: center;
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

		<div class="container">

			<div class="box">
				<figure>
					<img src="images/openAccount.png" height="150px">
					<figcaption>
						<h3>Open New Account</h3>
						<p>Online banking gives you the ability to manage your bank
							account over the internet using a computer or mobile device.
							There's no need to visit a bank branch, and you can do all of
							your banking tasks when it's most convenient for you, including
							outside of normal banking hours.You can open checking, savings,
							and other types of accounts online, often without the hassle of
							printing or physically signing anything. With electronic
							signature capability, the entire process might now take less than
							10 minute</p>
					</figcaption>
				</figure>
			</div>
			<div class="box">
				<figure>
					<img src="images/Deposit Money.jfif" height="150px">
					<figcaption>
						<h3>Deposit Money</h3>
						<p>All you need is the Sorting Code and Account number, along
							with the name of the account that the money is to paid in to (the
							latter mainly for reference and audit purposes).If you have
							on-line banking all you need to do is to go in to the menu and
							select the sub-menu, which will give you a reference number and
							the name of the companies you have alredy set up with their
							reference numbers (account numbers)- in the case of Collection
							Accounts which are central accounts within the company that
							receives all payments. and then a scondary allocation software
							then splits that money and allocates it reference and (card)
							account number.</p>
					</figcaption>
				</figure>
			</div>
		</div>
		<div class="container">
			<div class="box">
				<figure>
					<img src="images/WithdrawMoney.png" height="150px">
					<figcaption>
						<h3>Withdraw Money</h3>
						<p>To get cash, you can transfer money from your online bank
							account to an account you can access in person, such as
							transferring funds from an online savings account to an account
							you can access via an ATM or transferring money from an online
							account to an account with a traditional bank that has branches.</p>
					</figcaption>
				</figure>
			</div>
			<div class="box">
				<figure>
					<img src="images/MoneyTransfer.png" height="150px">
					<figcaption>
						<h3>Transfer Money</h3>
						<p>If you need to move money from your checking account to
							your savings account or into a certificate of deposit (CD), you
							can carry out these intrabank transfers online. You can even link
							your accounts at different banks or send money to friends and
							family almost instantly through person-to-person services
							accessible through your bank.</p>
					</figcaption>
				</figure>
			</div>

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