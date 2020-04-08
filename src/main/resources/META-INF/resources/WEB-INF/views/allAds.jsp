<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <title>Cars</title>
    </head>
    <body>
        <div align="center">
            <h2>Cars to bid on:</h2>
            <c:forEach items="${ads}" var="ad">
            <table border="1">
                <tr>
                    <td><b><c:out value="${ad.adTitle}"/>&nbsp;</b></td>
                    <td><form action="/ads/${ad.adId}/details"><input type="submit" value=" Details "></form></td>
                    <td><form action="/ads/${ad.adId}/newBid"><input type="submit" value=" Bid on it! "></form></td>
                </tr>
            </table>
            </c:forEach>
            <a href="/newAd">Add a Lot!</a>
        </div>
    </body>
</html>
