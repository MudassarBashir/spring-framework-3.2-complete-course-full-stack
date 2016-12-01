<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

    <head>
        <title>Title</title>
        <link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <table class="offers">
            <tr><td>Name</td><td>Email</td><td>Offer</td></tr>

            <c:forEach var="offer" items="${offers}">
                <tr>

                    <td><c:out value="${offer.name}"></c:out></td>

                    <td><c:out value="${offer.email}"></c:out></td>

                    <td><c:out value="${offer.text}"></c:out></td>

                </tr>
            </c:forEach>
        </table>
    </body>

</html>
