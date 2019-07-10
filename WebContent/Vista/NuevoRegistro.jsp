<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Registrar empleado</title>
</head>
<body>
<form action="/EmpresaPoo/Vista/RegistroExitoso.jsp" method="post">

<label>Nombre :</label>
<input type="text" name="nombre"></input>

<label>Cargo :</label>
<input type="radio" name="cargo" value="Planta">Planta</input>
<input type="radio" name="cargo" value="Contratista">Contratista</input>

<label>Identificacion :</label>
<input type="text" name="identificacion"></input>

<label>Salario :</label>
<input type="text" name="salario"></input>



<input type="submit" value="Registrar empleado"></input>
</form>

</body>
</html>