<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<! DOCTYPE html>
<html>
<body>
<form:form action="/addBook?library=${library}" modelAttribute="book">
    Title:
    <form:input path="title"/>
    <form:errors path="title"/>
    Author:
    <form:input path="author"/>
    <form:errors path="author"/>
    Genre:
    <form:input path="genre"/>
    <form:errors path="genre"/>
    Amount:
    <form:input path="amount"/>
    <form:errors path="amount"/>

    <input type="submit"/>
</form:form>
</body>
</html>