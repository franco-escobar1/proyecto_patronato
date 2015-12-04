<%@ page import="entities.TelefonoCliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patronato Nacional de Ciegos - Expediente Digital</title>
</head>
<body>
	<h1>Telefonos del Paciente:</h1>
	<% TelefonoCliente telefonoCliente = (TelefonoCliente) request.getAttribute("telefonoCliente"); %>
	<form action="process-telefono.html" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="telefonoCliente.idcliente" value="<%= telefonoCliente.getIdcliente() %>"></td>
			</tr>
			<tr>
				<td>Telefono de Habitacion:</td>
				<td><input type="text" name="telefonoCliente.telhabit" value="<%= telefonoCliente.getTelhabit() %>"></td>
			</tr>
			<tr>
				<td>Telefono Movil:</td>
				<td><input type="text" name="telefonoCliente.telmovil" value="<%= telefonoCliente.getTelmovil() %>"></td>
			</tr>
			<tr>
				<td>Telefono en el Trabajo:</td>
				<td><input type="text" name="telefonoCliente.teltrab" value="<%= telefonoCliente.getTeltrab() %>"></td>
			</tr>
			<tr>
				<td>Otro Telefono:</td>
				<td><input type="text" name="telefonoCliente.otrostel" value="<%= telefonoCliente.getOtrostel() %>"></td>
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