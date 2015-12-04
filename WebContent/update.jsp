<%@ page import="entities.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PANACI - Expediente Digital</title>
</head>
<body>
	<h1>Actualizar Paciente:</h1>
	<% Cliente cliente = (Cliente) request.getAttribute("cliente"); %>
	<form action="process-update.html" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="cliente.idcliente" value="<%= cliente.getIdcliente() %>"></td>
			</tr>
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="cliente.nombre" value="<%= cliente.getNombre() %>"></td>
			</tr>
			<tr>
				<td>Primer Apellido:</td>
				<td><input type="text" name="cliente.primerape" value="<%= cliente.getPrimerape() %>"></td>
			</tr>
			<tr>
				<td>Segundo Apellido:</td>
				<td><input type="text" name="cliente.segunape" value="<%= cliente.getSegunape() %>"></td>
			</tr>
			<tr>
				<td>Cedula:</td>
				<td><input type="text" name="cliente.cedula" value="<%= cliente.getCedula() %>"></td>
			</tr>
			<tr>
				<td>Nacionalidad:</td>
				<td><input type="text" name="cliente.nacionalidad" value="<%= cliente.getNacionalidad() %>"></td>
			</tr>
			<tr>
				<td>Fecha de Nacimiento:</td>
				<td>
					<fmt:formatDate value="<%= cliente.getFechaNacii() %>" var="fechanaci" pattern="yyyy-MM-dd"/>
					<input type="text" name="fechanaci" value="${fechanaci }">
				</td>
			</tr>
			<tr>
				<td>Sexo:</td>
				<td><input type="text" name="cliente.sexo" value="<%= cliente.getSexo() %>"></td>
			</tr>
			<tr>
				<td>Estado Civil:</td>
				<td><input type="text" name="cliente.estadoCivil" value="<%= cliente.getEstadoCivil() %>"></td>
			</tr>
			<!--  tr>
				<td>Imagen:</td>
				<td><input type="text" name="cliente.imagen" value="<%= cliente.getImagen() %>"></td>
			</tr-->
			<tr>
				<td>Ingreso el Reporte:</td>
				<td><input type="text" name="cliente.ingrepor" value="<%= cliente.getIngrepor() %>"></td>
			</tr>
			<tr>
				<td>Comentario:</td>
				<td><input type="text" name="cliente.coment" value="<%= cliente.getComent() %>"></td>
			</tr>
			<tr>
				<td>Fecha de Ingreso:</td>
				<td>
					<fmt:formatDate value="<%= cliente.getFechaIngre() %>" var="fechaing" pattern="yyyy-MM-dd"/>
					<input type="text" name="fechaingre" value="${fechaing }">
				</td>
			</tr>
			<tr>
				<td>Fuente de Informacion:</td>
				<td><input type="text" name="cliente.fuenteInf" value="<%= cliente.getFuenteInf() %>"></td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td><input type="text" name="cliente.estado" value="<%= cliente.getEstado() %>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Actualizar"></td>
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
</body>
</html>