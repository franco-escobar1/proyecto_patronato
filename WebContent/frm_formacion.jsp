<%@ page import="entities.FormacionCliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patronato Nacional de Ciegos - Expediente Digital</title>
</head>
<body>
	<h1>Formacion del Paciente:</h1>
	<% FormacionCliente formacionCliente = (FormacionCliente) request.getAttribute("formacionCliente"); %>
	<form action="process-formacion.html" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="formacionCliente.idcliente" value="<%= formacionCliente.getIdcliente() %>"></td>
			</tr>
			<tr>
				<td>Escolaridad:</td>
				<td><input type="text" name="formacionCliente.escolaridad" value="<%= formacionCliente.getEscolaridad() %>"></td>
			</tr>
			<tr>
				<td>Ocupacion:</td>
				<td><input type="text" name="formacionCliente.ocupacion" value="<%= formacionCliente.getOcupacion() %>"></td>
			</tr>
			<tr>
				<td>Carrera:</td>
				<td><input type="text" name="formacionCliente.carrera" value="<%= formacionCliente.getCarrera() %>"></td>
			</tr>
			<tr>
				<td>Educacion Especial:</td>
				<td><input type="text" name="formacionCliente.educEspe" value="<%= formacionCliente.getEducEspe() %>"></td>
			</tr>
			<tr>
				<td>Otros:</td>
				<td><input type="text" name="formacionCliente.otros" value="<%= formacionCliente.getOtros() %>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Guardar"></td>
			</tr>
		</table>
	</form>
	<%
		String message = (String) request.getAttribute("message");
		if(!(message == null)){
			out.println(message);
		}else{
			message = "";
			out.println(message);
		}
	%>
	<a href="index.html">Regresar a pagina principal</a>
</body>
</html>