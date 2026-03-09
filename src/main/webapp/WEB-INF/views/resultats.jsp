<h2>Résultats finaux</h2>

<table border="1">
    <tr>
        <th>Candidat - Matière</th>
        <th>Note finale</th>
    </tr>
    <c:forEach var="entry" items="${resultats}">
        <tr>
            <td>${entry.key}</td>
            <td>${entry.value}</td>
        </tr>
    </c:forEach>
</table>