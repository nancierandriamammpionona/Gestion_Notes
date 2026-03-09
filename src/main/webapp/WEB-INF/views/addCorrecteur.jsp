<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ajouter Correcteur</title>

</head>
<body>

<h2>Ajouter Correcteur</h2>

<form action="/correcteur/save" method="post">

    <label>Nom :</label>
    <input type="text" name="nom" required/>

    <div class="buttons">
        <button type="submit">Ajouter</button>
        <a href="/correcteurs">Retour à la liste des Correcteurs</a>
        <a href="/">Accueil</a>
    </div>

</form>

</body>
</html>