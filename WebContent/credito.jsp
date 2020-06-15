<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
</head>
<body>
	<h1>Solicitud de Crédito</h1>
		<form name="formulario" action="procesar.do" method="post">
			<table border="1">
				<tr>
					<td>Monto Credito</td>
					<td><input type="text" name="monto" value="" size="10"></td>
				</tr>
				<tr>
					<td>Cuotas</td>
					<td><select name="cuotas">
						<%for(int v=3; v<=24; v++){
						%>
						<option value="<%=v%>"><%=v%></option>
						<%}%>
						</select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Enviar" name="enviar">
			</table>
		</form>
</body>
</html>