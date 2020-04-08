<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <title>Your Lot</title>
    </head>
    <body>
        <div align="justify">
            <h2>Fill in to sell your auto!</h2>
            <form action="/newAd/add" method="post">
                <b>Title for the ad: </b><input type="text" name="adTitle" value="${adDto.adTitle}" required>
                <br>
                <b>Your vehicle manufacturer: </b><input type="text" name="manufacturer" value="${adDto.manufacturer}" required>
                <b>And it's model: </b><input  type="text" name="model" value="${adDto.model}" required>
                <b>Year it was manufactured: </b><input type="text" name="yearOfIssue" value="${adDto.yearOfIssue}" required>
                <br>
                <b>Everything else about your car: </b><input type="text" name="description"value="${adDto.description}">
                <br>
                <br>
                <b>Your name: </b><input type="text" name="ownerName" value="${adDto.ownerName}">
                <b>And cell number: </b><input type="text" placeholder="380998887766" name="ownerPhoneNumber" value="${adDto.ownerPhoneNumber}" required>
                <br>
                <br>
                <input type="submit" value=" Post the Lot ">
            </form>
        </div>
    </body>
</html>
