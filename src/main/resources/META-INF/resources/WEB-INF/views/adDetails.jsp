<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <title>Chosen Car</title>
    </head>
    <body>
        <div align="justify">
            <b>Item ID:</b><p><c:out value="${ad.adId}"/></p>
            <br>
            <h2><c:out value="${ad.adTitle}"/></h2>
            <b>Manufacturer:</b><p><c:out value="${ad.manufacturer}"/></p>
            <b>Model:</b><p><c:out value="${ad.model}"/></p>
            <b>Year of issue:</b><p><c:out value="${ad.yearOfIssue}"/></p>
            <b>More:</b><p><c:out value="${ad.description}"/></p>
            <br>
            <form action="/ads/${ad.adId}/newBid"><input type="submit" value=" Bid on it! "></form>
        </div>
    </body>
</html>
