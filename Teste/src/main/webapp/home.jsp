<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Its Working!</title>
</head>
<body>
	<form action="Testeservlet" method="post">
		<label>Nome</label>
		<br>
		<input type="text" id="nome" name="nome"><br><br>
		<label>Idade</label><br>
		<input type="number" id="idade" name="idade"><br><br>
		<label>Preferências</label><br><br>
		<select name="preferencias" id="preferencias" name="preferencias" multiple>
		<option value="game">game</option>
  		<option value="carros">carros</option>
  		<option value="passear">passear</option>
  		<option value="estudar">estudar</option>
		</select>
		<br>
		<br>
		<input type="submit" value="Enviar">
	</form>
	
</body>
</html>