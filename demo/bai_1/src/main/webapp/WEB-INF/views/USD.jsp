<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022-12-15
  Time: 5:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>QUY ĐỔI TIỀN TỆ</h1>
    <form action="/Tiente" method="post">
        <table>
            <tr>
                <td>USD</td>
                <td><input type="number" name="usd"></td>
            </tr>
            <tr>
                <td><input type="submit"></td>
                <td><input type="reset"></td>
            </tr>
        </table>
    </form>
    <p>Result: <span>${change}</span></p>
</body>
</html>
