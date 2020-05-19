<%@ pa"WebContent/ListeEtudiants.jsp"ge language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.ENSAK.TPWeb.Metier.Etudiant, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border='1'>
	<tr>
		<th>CNE</th>
		<th>Nom</th>
		<th>Prenom</th>
		<th>Addresse</th>
		<th>Numero</th>
	</tr>
	<%
	ArrayList<Etudiant> list = (ArrayList<Etudiant>) request.getAttribute("ControleEtudiant");
	for(Etudiant etudiants : list) {
		out.println(
			"<tr>" +
                "<td>" +etudiants.getCne()+"</td>" +
                "<td>" +etudiants.getNomE()+"</td>" +
                "<td>" +etudiants.getPrenomE()+"</td>" +
                "<td>" +etudiants.getAddresseE()+"</td>" +
                "<td>" +etudiants.getNumero()+"</td>" +
            "</tr>");
    	}
    %>
</table>
</body>
</html>