<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Modifier Candidat</title>
</head>
<body>

<h2>Modifier Candidat</h2>

<form action="/candidat/update" method="post">

    <input type="hidden" name="id" value="${candidat.id}"/>

    <label>Nom :</label>
    <input type="text" name="nom" value="${candidat.nom}" required/>

    
    <label>Prenom :</label>
    <input type="text" name="prenom" value="${candidat.prenom}" required/>

    <div class="buttons">
        <button type="submit">Modifier</button>
        <a href="/candidats">Retour à la liste des Candidats</a>
        <a href="/">Accueil</a>
    </div>

</form>

</body>
</html>