<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <title>Your Bid</title>
    </head>
    <body>
        <div align="justify">
            <b>Item ID: </b><p><c:out value="${ad.adId}"/></p>
            <br>
            <h2>Fill in to get "<c:out value="${ad.adTitle}"/>"!</h2>
            <form action="/ads/${ad.adId}/newBid/add" method="post">
                <b>Set your bid price: </b><input type="text" placeholder="123.45" name="price" value="${bidDto.price}" required>
                <br>
                <br>
                <b>Your name: </b><input type="text" name="bidderName" value="${bidDto.bidderName}">
                <b>And cell number: </b><input type="text" placeholder="380998887766" name="bidderPhoneNumber" value="${bidDto.bidderPhoneNumber}" required>
                <br>
                <br>
                <input type="submit" value=" Place the Bid ">
            </form>
        </div>
    </body>
</html>
