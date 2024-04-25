<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<! DOCTYPE html>
<html>
<body>
<c:forEach items="${books}" var="x">
    <p>Title: ${x.title}, Author: ${x.author}, Genre: ${x.genre}, Amount: ${x.amount}  </p>

</c:forEach>
<a href="/newBook?library=${library}">New Book</a>
</body>
</html>
