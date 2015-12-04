<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patronato Nacional de Ciegos - Expediente Digital</title>
</head>
<body>
	<h1>Ingresar Nuevo Paciente:</h1>
	<form action="process-addnew.html" method="post">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="cliente.nombre"></td>
			</tr>
			<tr>
				<td>Primer Apellido:</td>
				<td><input type="text" name="cliente.primerape"></td>
			</tr>
			<tr>
				<td>Segundo Apellido:</td>
				<td><input type="text" name="cliente.segunape"></td>
			</tr>
			<tr>
				<td>Cedula:</td>
				<td><input type="text" name="cliente.cedula"></td>
			</tr>
			<tr>
				<td>Nacionalidad:</td>
				<td><input type="text" name="cliente.nacionalidad"></td>
			</tr>
			<tr>
				<td>Fecha de Nacimiento:</td>
				<td><input type="text" name="fechanaci"></td>
			</tr>
			<tr>
				<td>Sexo:</td>
				<td><input type="text" name="cliente.sexo"></td>
			</tr>
			<tr>
				<td>Estado Civil:</td>
				<td><input type="text" name="cliente.estadoCivil"></td>
			</tr>
			<!--tr>
				<td>Imagen:</td>
				<td><input type="text" name="cliente.imagen"></td>
			</tr-->
			<tr>
				<td>Ingreso el Reporte:</td>
				<td><input type="text" name="cliente.ingrepor"></td>
			</tr>
			<tr>
				<td>Comentario:</td>
				<td><input type="text" name="cliente.coment"></td>
			</tr>
			<tr>
				<td>Fecha de Ingreso:</td>
				<td><input type="text" name="fechaingre"></td>
			</tr>
			<tr>
				<td>Fuente de la Informacion:</td>
				<td><input type="text" name="cliente.fuenteInf"></td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td><input type="text" name="cliente.estado"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Agregar Paciente"></td>
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