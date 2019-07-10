<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<%@page import="com.myapp.empresapoo.controlador.ConsultarEmpleado, com.myapp.empresapoo.modelo.Empleado" %>
<% ConsultarEmpleado.verEmpleados();%>
<p>
</p>
<%=ConsultarEmpleado.getInform() %>

<form method="post" action="/EmpresaPoo/Vista/ConsultarEmpleados.jsp">

	<label>Ingrese su numero de identificacion</label>
	<%ConsultarEmpleado.buscarUnEmpleado(888888); %>
	<input name="identificacion"></input>
	<input type="submit" value="enviar"></input>
</form>

</body>
</html>