<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<! DOCTYPE html>
<html>
<body>
    <c:forEach items="${libraries}" var="x">
        <p>President: ${x.president}, Website: ${x.website} <a href="/books?library=${x.id}">Books</a></p>

    </c:forEach>
</body>
</html>
