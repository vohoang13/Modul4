<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022-12-18
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>SandWich Condiments</h1>
  <form action="/condiments/List" method="post">
    <table border="1">
      <tr>
        <th>Name SandWich</th>
        <th>Condiments</th>
      </tr>
      <tr>
        <td><input type="text" name="name"></td>
        <td>
          <input type="checkbox" name="condiments" value="Luttuce">Luttuce
          <input type="checkbox" name="condiments" value="Tomato">Tomato
          <input type="checkbox" name="condiments" value="Mustard">Mustard
          <input type="checkbox" name="condiments" value="Sprouts">Sprouts
        </td>
      </tr>
      <tr>
        <td colspan="2"><input type="submit"></td>
      </tr>
    </table>
  </form>
</body>
</html>
