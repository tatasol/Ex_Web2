<%--
  Created by IntelliJ IDEA.
  User: solar
  Date: 13/12/2024
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Alunos</title>
</head>
<body>
<h1>Cadastro de Alunos</h1>

<form method="post" action="alunos">
    <label>Matrícula: <input type="number" name="matricula" required></label><br>
    <label>Nome: <input type="text" name="nomeAluno" required></label><br>
    <input type="submit" value="Cadastrar">
</form>

<h2>Alunos Cadastrados</h2>
<table border="1">
    <tr>
        <th>Matrícula</th>
        <th>Nome</th>
    </tr>
    <forEach var="aluno" items="${alunos}">
        <tr>
            <td>${aluno.matricula}</td>
            <td>${aluno.nomeAluno}</td>
        </tr>
    </forEach>
</table>
</body>
</html>