<!DOCTYPE html>
<html>
<head>
     <title>Manager Haseł</title>
</head>
<body>
<h1>${password.title}<br><br></h1>
<b>Strona:</b>${password.site}<br>
<b>Login:</b>${password.login}<br>
<b>Hasło:</b>${password.password}<br>
<hr>
<form action="/password/delete/${password.id}" method="post">
    <input type="submit" value="Usunąć"/>
</form>
</body>
</html>