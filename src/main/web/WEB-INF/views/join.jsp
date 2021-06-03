<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/users/join" method="post">
        <label for="username">username</label>
        <input type="text" name="username" id="username">

        <label for="password">password</label>
        <input type="password" name="password" id="password">

        <label for="name">name</label>
        <input type="text" name="name" id="name">
        <button type="submit">Join</button>
    </form>
</body>
</html>
