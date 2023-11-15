<!DOCTYPE html>
<html>
<head>
     <title>Manager Haseł</title>
</head>
<body>
<h1>Manager Haseł</h1>
<form action="/" method="get">
    Szukać po nazwie:<input type="text" name="title"><br>
    <input type="submit" value="Szukaj"/>
</form>
<#list passwords as password>
    <div>
        <p><b>${password.title}</b> ${password.login} <a href="/password/${password.id}"> -> </a></p>
    </div>
</#list>
<hr>
<h3>Dodaj nowe hasło</h3>
<form action="/password/create" method="post">
    Nazwa: <input type="text" name="title"/><br><br>
    Strona: <input type="text" name="site"/><br><br>
    Login: <input type="text" name="login"/><br><br>
    Hasło: <input type="text" name="password"/><br><br>
    <input type="submit" value="Ok">
</form>
</body>
</html>
