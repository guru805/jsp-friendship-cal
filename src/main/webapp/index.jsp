<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="http://localhost:8080/jspservelt-app-friends-calculator/assets/style.css" /> 
		<title>FRIENDSHIP CALCULATOR</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	</head>
	<body>
		<form action="http://localhost:8080/jspservelt-app-friends-calculator/friends" method="post">
			<img alt="" src="http://localhost:8080/jspservelt-app-friends-calculator/assets/friends.svg">
			<div class="about">
				<h1>FRIENDSHIP CALCULATOR</h1><br>
				<h2>This friendship calculator puts the relationship between you and your friend to test and predicts a friendship percentage between the two of you based on your names. Discover more on the subject below the form.</h2>
			</div>
			<div class="container">
				<div class="inputSection">
					<div class="friend1">
						<h3>Enter Your Name</h3><br>
						<input type="text" name="friend1">
					</div>
					<div class="friend2">
						<h3>Enter Your Friend's Name</h3><br>
						<input type="text" name="friend2">
					</div>
				</div><br><br>
				<div>
					<button name="calculate">Calculate</button>
				</div><br>
				<h3>Based on the name similarity, the friendship strength between <%out.print(request.getAttribute("myName"));%> and <%out.print(request.getAttribute("friendName"));%> is: <%out.print(request.getAttribute("result"));%>%</h3>
			</div>
			<div class="footer"></div>
		</form>
	</body>
	
</html>