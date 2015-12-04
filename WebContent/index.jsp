<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patronato Nacional de Ciegos - Expediente Digital</title>
</head>
<body>
	<a href="addnew.html">Agregar Nuevo Paciente</a> 
	|
	<a href="search.html">Buscar</a>
	<h1>Lista de Pacientes:</h1>
	<table border="1px solid black">
		<tr>
			<th>Opcion</th>
			<th>ID</th>
			<th>Nombre</th>
			<th>Primer Apellido</th>
			<th>Segundo Apellido</th>
			<!-- <th>Cedula</th>
			<th>Nacionalidad</th>
			<th>Fecha de Nacimiento:</th>
			<th>Sexo</th>
			<th>Estado Civil</th>
			<th>Imagen</th>
			<th>Ingresó el reporte</th>
			<th>Comentario</th>
			<th>Fecha de Ingreso</th>
			<th>Fuente de Informacion</th>
			<th>Estado</th>	 -->		
		</tr>
		<c:forEach var="cliente" items="${lstClientes }">
			<tr>
				<td>
					<s:url var="updateURL" value="update.html">
						<s:param name="clienteID">${cliente.idcliente }</s:param>
					</s:url>
					<s:a href="%{updateURL}">Actualizar<br/></s:a>
				
					<s:url var="diagnosticoURL" value="diagnostico.html">
						<s:param name="clienteID">${cliente.idcliente }</s:param>
					</s:url>
					<s:a href="%{diagnosticoURL}">Diagnostico<br/></s:a>
				
				
					<s:url var="formacionURL" value="formacion.html">
						<s:param name="clienteID">${cliente.idcliente }</s:param>
					</s:url>
					<s:a href="%{formacionURL}">Formacion<br/></s:a>
				
				
					<s:url var="direccionURL" value="direccion.html">
						<s:param name="clienteID">${cliente.idcliente }</s:param>
					</s:url>
					<s:a href="%{direccionURL}">Direccion<br/></s:a>
				
				
					<s:url var="telefonosURL" value="telefono.html">
						<s:param name="clienteID">${cliente.idcliente }</s:param>
					</s:url>
					<s:a href="%{telefonosURL}">Telefonos</s:a>
				</td>
				<td>${cliente.idcliente }</td>
				<td>${cliente.nombre }</td>
				<td>${cliente.primerape }</td>
				<td>${cliente.segunape }</td>
				<%-- <td>${cliente.cedula }</td>
				<td>${cliente.nacionalidad }</td>
				<td>
					<fmt:formatDate value="${cliente.fechaNacii }" pattern="yyyy-MM-dd"/>
				</td>
				<td>${cliente.sexo }</td>
				<td>${cliente.estadoCivil }</td>
				<td>${cliente.imagen }</td>
				<td>${cliente.ingrepor }</td>
				<td>${cliente.coment }</td>
				<td>
					<fmt:formatDate value="${cliente.fechaIngre }" pattern="yyyy-MM-dd"/>
				</td>
				<td>${cliente.fuenteInf }</td>
				<td>${cliente.estado }</td> --%>
			</tr>
		</c:forEach>
	</table>
</body>
</html>