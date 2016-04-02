<head>
    <title>Disable Browser Back Button Using JavaScript</title>

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js">
        </script>
</head>
<script>
    $(document).ready(function() {
        function disableBack() { window.history.forward() }

        window.onload = disableBack();
        window.onpageshow = function(evt) { if (evt.persisted) disableBack() }
    });
</script>
	<div align="center">
		<br> <br>
		<form action="loginUser" method="post">
			Enter Your Username: <input type="text" name="userName"> <br>
			Enter Your Password: <input type="password" name="password">
			<br> <br> <br> <input type="submit" value="Login">
		</form>
	</div>

</body>
</html>