<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form action="LoginServlet" method="post">
    Usuário: <input type="text" name="username" required><br>
    Senha: <input type="password" name="password" required><br>
    <input type="submit" value="Entrar">
</form>
<%
    String errorMessage = (String) request.getAttribute("errorMessage");
    if (errorMessage != null) {
%>
<p style="color:red;"><%= errorMessage %></p>
<% } %>
</body>
</html>
