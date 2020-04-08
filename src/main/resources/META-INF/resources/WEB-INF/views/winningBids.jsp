<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <title>Winners</title>
    </head>
    <body>
        <div align="center">
            <h2>Winning bids:</h2>
            <c:forEach items="${bids}" var="bid">
            <table border="1">
                <tr>
                    <th>Item ID</th>
                    <th>Item details</th>
                    <th>Bid price</th>
                    <th>Winner name</th>
                    <th>Winner cell</th>
                <tr>
                    <td><b><c:out value="${bid.adId}"/>&nbsp;</b></td>
                    <td><form action="/ads/${bid.adId}/details"><input type="submit" value=" Ad details "></form></td>
                    <td><c:out value="${bid.price}"/>&nbsp;</td>
                    <td><c:out value="${bid.bidderName}"/>&nbsp;</td>
                    <td><b><c:out value="${bid.bidderPhoneNumber}"/>&nbsp;</b></td>
                </tr>
            </table>
            </c:forEach>
        </div>
    </body>
</html>