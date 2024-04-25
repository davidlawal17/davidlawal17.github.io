<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<! DOCTYPE html>
<html>
<body>
<form:form action="/addLibrary" modelAttribute="library">
ID:
    <form:input path="id"/>
    <form:errors path="id"/>
President:
     <form:input path="president"/>
    <form:errors path="president"/>
Website:
    <form:input path="website"/>
    <form:errors path="website"/>

    <input type="submit"/>

</form:form>
</body>
</html>