<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Liste des candidats</title>
</head>
<body>

<h2>Liste des candidats</h2>
 <a href="/candidat/add">Ajouter un nouveau candidat</a>
<table border="1">
<tr>
    <th>ID</th>
    <th>Nom</th>
    <th>Prenom</th>
    <th>Action</th>
</tr>

<c:forEach var="c" items="${candidats}">
<tr>
    <td>${c.id}</td>
    <td>${c.nom}</td>
    <td>${c.prenom}</td>
    <td>
        <a href="/candidat/edit/${c.id}">Modifier</a>
        <a href="/candidat/delete/${c.id}">Supprimer</a>
    </td>
</tr>
</c:forEach>

</table>
<a href="/">← Retour à l’accueil</a>
</body>
</html>