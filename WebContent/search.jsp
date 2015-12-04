<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patronato Nacional de Ciegos - Expediente Digital</title>
</head>
<body>
	<h1>Buscar Paciente:</h1>
	<form action="process-search.html" method="post">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre"></td>
				<td><input type="submit" value="Search"></td>
			</tr>
		</table>
	</form>
	<br><br>
	<table border="1px solid black">
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Primer Apellido</th>
			<th>Segundo Apellido</th>
			<th>Cedula</th>
			<th>Nacionalidad</th>
			<th>Fecha de Nacimiento:</th>
			<th>Sexo</th>
			<th>Estado Civil</th>
			<th>Imagen</th>
			<th>Ingresó el reporte</th>
			<th>Comentario</th>
			<th>Fecha de Ingreso</th>
			<th>Fuente de Informacion</th>
			<th>Estado</th>
			<th>Opcion</th>
		</tr>
		<c:choose>
			<c:when test="${not empty lstClientes }">
				<c:forEach var="cliente" items="${lstClientes }">
					<tr>
						<td>${cliente.idcliente }</td>
				<td>${cliente.nombre }</td>
				<td>${cliente.primerape }</td>
				<td>${cliente.segunape }</td>
				<td>${cliente.cedula }</td>
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
				<td>${cliente.estado }</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="4"><% out.println("No se encontro la informacion!"); %></td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
</body>
</html>