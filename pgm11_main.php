
<html>
<head>
<title>Movie Ticket Booking</title>
</head>
<body style="color: white;font-size: 15px;font-weight: bold;" background="back.jpg" >
<center>
<br/><br/><br/>
<h1><u>BOOK YOU MOVIE</u></h1>
<br/><br/><br/>
<form action="./pgm11_response.php" method="GET">
<label>Choose Movie : </label>
<select name="movie">
<option value="">--Select--</option>
<option value="Spider Man">Spider Man</option>
<option value="Dunkirk">Dunkirk</option>
<option value="Annabelle">Annabelle</option>
</select>
<br/><br/><br/>
<label>Show Time : </label>
<select name="time">
<option value="">--Select--</option>
<option value="10">10:00AM</option>
<option value="12">12:00PM</option>
<option value="5">05:00PM</option>
</select>
<br/><br/><br/>
<label>Seat : </label>
<input type="radio" name="seat" value="120"/>Silver Rs120
<input type="radio" name="seat" value="150"/>Premium Rs150
<input type="radio" name="seat" value="120"/>Gold Rs180
<br/><br/><br/>
<label>No of Tickets : </label>
<select>
<option value="">--Select--</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
</select>
<br/><br/><br/><br/>
<input type="submit" name="submit" value="Confirm ">
</form>
</center>
</body>
</html>