<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="user" items="${users}">
  <div>
    <p>username: ${user.username}</p>
    <p>name: ${user.name}</p>
  </div>
</c:forEach>
</body>
</html>
