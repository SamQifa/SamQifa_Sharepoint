
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en-US">
	<head>
		<meta charset="utf-8" />
		<title>Home page</title>
		<style>
.header {
	background-color: #CCFFFF;
	width: 100%;
	height: 100px;
	text-align: center;
}

.left {
	background-color: #DDDDDD;
	width: 33.33%;
	height: 300px;
	float: left;
}

.content {
	background-color: #808080;
	width: 33.33%;
	height: 300px;
	float: left;
	text-align: center;
}

.right {
	background-color: #DDDDDD;
	width: 33.33%;
	height: 300px;
	float: left;
}

.footer {
	background-color: #CC99FF;
	width: 100%;
	height: 50px;
	float: right;
	text-align: center;
}
</style>
	</head>
	<body>
		<div class="header">
			Home page
		</div>
		<div class="left">
			
		</div>
		<div class="content">
			<p>
				${message}
				<br />
				<a href="${pageContext.request.contextPath}/team/add.html">Add new team</a>
				<br />
				<a href="${pageContext.request.contextPath}/team/list.html">Team list</a>
				<br />
				<a href="${pageContext.request.contextPath}/country/list.html">Country list</a>
				<br />
				<a href="${pageContext.request.contextPath}/country/add.html">Add new country</a>
				<br />
				<a href="${pageContext.request.contextPath}/account/add.html">Sign In</a>
				<br />
			</p>
		</div>
		<div class="right">
			
		</div>
		<div class="footer">
			This is footer
		</div>
	</body>
</html>