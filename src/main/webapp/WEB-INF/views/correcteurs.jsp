<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Liste Correcteurs</title>
</head>
<body>

<h2>Liste des Correcteurs</h2>
 <a href="/correcteur/add">Ajouter un nouveau correcteur</a>
<table border="1">
<tr>
    <th>ID</th>
    <th>Nom</th>
    <th>Action</th>
</tr>

<c:forEach var="c" items="${correcteurs}">
<tr>
    <td>${c.id}</td>
    <td>${c.nom}</td>
    <td>
        <a href="/correcteur/edit/${c.id}">Modifier</a>
        <a href="/correcteur/delete/${c.id}">Supprimer</a>
    </td>
</tr>
</c:forEach>

</table>
<a href="/">← Retour à l’accueil</a>
</body>
</html>