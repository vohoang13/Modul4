<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022-12-16
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Dictionary</h1>
  <form action="/search" method="post">
      <table>
          <tr>
              <td>English</td>
              <td><input type="text" name="eng"></td>
          </tr>
          <tr>
              <td><input type="submit"></td>
          </tr>
      </table>
  </form>
  <p>Result: <span>${result}</span></p>
</body>
</html>
