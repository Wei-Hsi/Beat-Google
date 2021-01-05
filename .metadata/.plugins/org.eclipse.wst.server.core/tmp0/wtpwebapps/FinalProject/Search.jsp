<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>MovieTime</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <script src='https://kit.fontawesome.com/a076d05399.js'></script>
</head>
<body>
	<div class="container" style="text-align: center">
		<img src="MovieTime.png" width="600" height="338">
	<div class="container" style="text-align: center">
		<h6>Pick a movie  <i class='fas fa-fast-forward'> </i></h6>
	</div>
	<form action='${requestUri}' method='get'>
	<input type='text' name='keyword' placeholder='Enter movie' size= "35px"/>
	<br><br><input type='submit' value='Search' class="btn btn-outline-primary badge-pill"/>
	</form>
	</div>
</body>
</html>