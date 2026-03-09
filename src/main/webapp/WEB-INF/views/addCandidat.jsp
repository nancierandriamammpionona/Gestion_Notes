<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ajouter Candidat</title>

</head>
<body>

<h2>Ajouter Candidat</h2>

<form action="/candidat/save" method="post">

    <label>Nom :</label>
    <input type="text" name="nom" required/>

     <label>Prenom :</label>
    <input type="text" name="prenom" required/>

    <div class="buttons">
        <button type="submit">Ajouter</button>
        <a href="/candidats">Retour à la liste des Candidats</a>
        <a href="/">Accueil</a>
    </div>

</form>

</body>
</html>