<%@ page import="entities.DiagnosticoCliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patronato Nacional de Ciegos - Expediente Digital</title>
</head>
<body>
	<h1>Diagnostico de Paciente:</h1>
	<% DiagnosticoCliente diagnosticoCliente = (DiagnosticoCliente) request.getAttribute("diagnosticoCliente"); %>
	<form action="process-diagnostico.html" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="diagnosticoCliente.idcliente" value="<%= diagnosticoCliente.getIdcliente() %>"></td>
			</tr>
			<tr>
				<td>Diagnostico:</td>
				<td><input type="text" name="diagnosticoCliente.diagnostico" value="<%= diagnosticoCliente.getDiagnostico() %>"></td>
			</tr>
			<tr>
				<td>Nivel de Ceguera:</td>
				<td><input type="text" name="diagnosticoCliente.nivelceguera" value="<%= diagnosticoCliente.getNivelceguera() %>"></td>
			</tr>
			<tr>
				<td>Origen de la Ceguera:</td>
				<td><input type="text" name="diagnosticoCliente.origenceguera" value="<%= diagnosticoCliente.getOrigenceguera() %>"></td>
			</tr>
			<tr>
				<td>Otra discapacidad:</td>
				<td><input type="text" name="diagnosticoCliente.otradiscap" value="<%= diagnosticoCliente.getOtradiscap() %>"></td>
			</tr>
			<tr>
				<td>Comentario:</td>
				<td><input type="text" name="diagnosticoCliente.comentario" value="<%= diagnosticoCliente.getComentario() %>"></td>
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