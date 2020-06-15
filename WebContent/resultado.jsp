<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado</title>
</head>
<body>
	<h1>Tus cuotas son de:</h1>
	<jsp:useBean id="credito" scope="request" class="modelo.credito" />
	<p>
	<table border="1">
		<tr>
			<td>Monto Solicitado.</td>
			<td><%=credito.getMontoInicial()%></td>
		</tr>
		<tr>
			<td>Cuotas</td>
			<td><%=credito.getCuotas()%></td>
		</tr>
		<tr>
			<td>Tasa de Interés.</td>
			<td><%=credito.getTasa()%></td>
		</tr>
		<tr>
			<td colspan="2">Detalle de Cuotas.</td>
		</tr>
		<%int x=0;%>
		<c:forEach var="cuota" items="${credito.listaCuotas}">
			<%x++;%>
				<tr>
					<td>Cuota N° : <%=x%></td>
					<td> ${cuota} </td>
				</tr>
		</c:forEach>
			<tr>
				<td>Monto final del Crédito :</td>
				<td><%=credito.getMontoFinal()%></td>
			</tr>	
	</table>
	</p>
	<p>
		<a href="credito.jsp">Volver al inicio</a>
	</p>
</body>
</html>