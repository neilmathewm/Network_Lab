<html>
<head></head>
<body style="color: white;font-size: 15px;font-weight: bold;" background="back.jpg">
<center>
<form action="./pgm11_login.php" method="POST"><br><br><br>
	<br><br><h1>Sign In</h1><br><br>
	<input type="text" placeholder="Username" name="uid"><br><br>
	<input type="password" placeholder="Password" name="pass"><br><br><br> 
	<input type="submit" name="submit" value="Log In">
</form>
</center>
</body>
</html>
<?php
if(isset($_POST['submit']))
	{
		if($_POST['uid']=="neil"&&$_POST['pass']=="123")
			{
			header("Location:./pgm11_main.php");
			}
		else 
			echo "Invalid username or password";
	}
?>