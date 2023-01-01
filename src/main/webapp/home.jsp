<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.JavaBeans" %>
<%@ page import = "java.util.ArrayList" %>
<%
	@SuppressWarnings("unchecked")
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("contatos");
%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Agenda</title>
	</head>
	<body>
		<h1>Agenda de contatos</h1>
		<table id="tabela">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Phone</th>
					<th>E-mail</th>
				</tr>
			</thead>
			<tbody>
				<%for(JavaBeans x : lista){ %>
					<tr class ="linhaTr">
						<td><%= x.getIdcon() %> </td>
						<td><%= x.getNome() %> </td>
						<td><%= x.getFone() %> </td>
						<td><%= x.getEmail() %> </td>
					</tr>
				<%}%>
			</tbody>
		</table>
		<a href="index.html"><h2>return</h2></a>
	</body>
</html>