<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@page import="com.myapp.empresapoo.modelo.Contratista"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Registro exitoso</title>
</head>
<body>
<%@page import="com.myapp.empresapoo.controlador.GuardarEmpleados,com.myapp.empresapoo.modelo.Empleado"%>
<%
 String cargo= request.getParameter("cargo") ;
 int identificacion = Integer.parseInt(request.getParameter("identificacion"));
 String nombre=request.getParameter("nombre") ;
 float salario = Integer.parseInt(request.getParameter("salario"));
 
 
 System.out
 .print(identificacion + cargo +nombre + salario);
 //Creando el nuevo objeto empleado
 if(cargo !=null && identificacion != 0 && nombre !=null && salario != 0){
	 Empleado empleado = new	Empleado(cargo,identificacion,nombre,salario);
	 ServletContext sc = getServletContext();
	 String link = sc.getRealPath("/WEB-INF/empleados.txt");
	 link = link.replace('\\', '/');
	  
	  GuardarEmpleados.añadir(empleado, link);
 }else{
	 
	 System.out.println("Los datos estan nulos");
 }

%>
<h1>Datos regitrados</h1>
<table>
<tr>
<td>Nombre completo</td>
<td>Identificacion</td>
<td>Cargo</td>
<td>Salario</td>
</tr>

<tr>
<td><%=nombre %></td>
<td><%=identificacion %></td>
<td><%=cargo %></td>
<td><%=salario %></td>
</tr>
</table>

<form action="/EmpresaPoo/Vista/NuevoRegistro.jsp" method="post">
 <input type="submit" value="Nuevo Registro">
 </form>

</body>