<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Registration Form</title>
    </head>

    <body>
        <form:form action="processForm" modelAttribute="student">
            First name: <form:input path="firstName" />
            <br><br>
            Last name: <form:input path="lastName" />
            <br><br>
        <%--    Country: <form:select path="country">--%>
        <%--    <form:option value="Br" label="Brazil"/>--%>
        <%--    <form:option value="Ua" label="Ukraine"/>--%>
        <%--    <form:option value="Fr" label="France"/>--%>
        <%--    </form:select>--%>
            <br><br>
            Country:
                <form:select path="country">
                    <form:options items="${student.countryOptions}"/>
                </form:select>
            <br><br>
            Favorite language:
                <form:radiobutton path="favoriteLanguage" label="Java" value="Java"/>
                <form:radiobutton path="favoriteLanguage" label="PHP" value="PHP"/>
                <form:radiobutton path="favoriteLanguage" label="C++" value="C++"/>
            <br><br>
            Operating System:
                <form:checkbox path="operationSystem" label="Windows" value="Windows"/>
                <form:checkbox path="operationSystem" label="Apple" value="Apple"/>
                <form:checkbox path="operationSystem" label="Linux" value="Linux"/>
            <br><br>
                <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>