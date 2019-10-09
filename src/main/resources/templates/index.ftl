<html>
<body>
<form method="get" action="index" >
    <input type="text" name="name" placeholder="name"/>
    <input type="submit" value="send">
</form>
<br>
<h1>Hello, ${name?if_exists}</h1>
</body>
</html>