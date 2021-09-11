<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Autores</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
	crossorigin="anonymous"></script>
</head>
<body>
<body class="container">
	<form action="<c:url value="/autores"/>" method="POST">
		<h1 class="text-center">Cadastro de Autor</h1>
		<div class="form-group">
			<label for="nome">Nome</label> <input id="nome" class="form-control"
				name="nome">
		</div>
		<div class="form-group">
			<label for="email">Email</label> <input id="email"
				class="form-control" name="email">
		</div>
		<div class="form-group">
			<label for="dataNascimento">Data de Nascimento</label> <input
				id="dataNascimento" class="form-control" name="dataNascimento">
		</div>
		<div class="form-group">
			<label for="miniCurriculum">Mini Curriculum</label> <input
				id="miniCurriculum" class="form-control" name="miniCurriculum">

			<input type="submit" value="Cadastrar" class="mt-2 btn-primary">
	</form>
	<h1 class="text-center">Lista de Autores</h1>
	<table class="table table-hover table-striped table-bordered">
		<thead>
			<tr>
				<th>NOME</th>
				<th>EMAIL</th>
				<th>DATA DE NASCIMENTO</th>
				<th>MINI CURRICULUM</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${autores}" var="a">
				<tr>
					<td>${a.nome}</td>
					<td>${a.email}</td>
					<td>${a.dataNascimento}</td>
					<td>${a.miniCurriculum}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>