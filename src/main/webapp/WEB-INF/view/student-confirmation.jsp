<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

    <head>
        <title>student-confirmation</title>
    </head>

    <body>
            The student is confirmed: ${student.firstName} ${student.lastName}
        <br>
            County: ${student.country}
        <br>
            Language: ${student.favoriteLanguage}
        <br>
            Operation System:
                <c:forEach var="temp" items="${student.operationSystem}">
                    <li>${temp}</li>
                </c:forEach>
    </body>

</html>