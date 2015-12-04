<%@ page import="entities.DirecCliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patronato Nacional de Ciegos - Expediente Digital</title>
</head>
<body>
	<h1>Direccion del Paciente:</h1>
	<% DirecCliente direcCliente = (DirecCliente) request.getAttribute("direcCliente"); %>
	<form action="process-direccion.html" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="direcCliente.idcliente" value="<%= direcCliente.getIdcliente() %>"></td>
			</tr>
			<tr>
				<td>Provincia:</td>
				<td><input type="text" name="direcCliente.provincia" value="<%= direcCliente.getProvincia() %>"></td>
			</tr>
			<tr>
				<td>Canton:</td>
				<td><input type="text" name="direcCliente.canton" value="<%= direcCliente.getCanton() %>"></td>
			</tr>
			<tr>
				<td>Distrito:</td>
				<td><input type="text" name="direcCliente.distrito" value="<%= direcCliente.getDistrito() %>"></td>
			</tr>
			<tr>
				<td>Otro:</td>
				<td><input type="text" name="direcCliente.otro" value="<%= direcCliente.getOtro() %>"></td>
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