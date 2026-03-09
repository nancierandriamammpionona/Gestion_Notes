<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Modifier Correcteur</title>
   
</head>
<body>

<h2>Modifier Correcteur</h2>

<form action="/correcteur/update" method="post">

    <input type="hidden" name="id" value="${correcteur.id}"/>

    <label>Nom :</label>
    <input type="text" name="nom" value="${correcteur.nom}" required/>

    <div class="buttons">
        <button type="submit">Modifier</button>
        <a href="/correcteurs">Retour à la liste des Correcteurs</a>
        <a href="/">Accueil</a>
    </div>

</form>

</body>
</html>