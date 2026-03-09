<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Note finale par matière</title>
</head>
<body>
<h2>Obtenir la note finale d'une matière</h2>

<form action="calculNoteFinale" method="post">
    <!-- ID Candidat -->
    <label>ID Candidat : </label>
    <input type="number" name="idCandidat" required><br><br>

    <!-- Sélection de la matière -->
    <label>Matière : </label>
    <select name="idMatiere" required>
        <c:forEach var="matiere" items="${matieres}">
            <option value="${matiere.id}">${matiere.matiere}</option>
        </c:forEach>
    </select><br><br>

    <button type="submit">Calculer</button>
</form>

<!-- Affichage de la note finale si disponible -->
<c:if test="${not empty noteFinale}">
    <p>Note finale : <b>${noteFinale}</b> / 20</p>
</c:if>

</body>
</html>