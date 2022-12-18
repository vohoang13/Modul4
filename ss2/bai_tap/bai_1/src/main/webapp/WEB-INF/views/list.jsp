<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022-12-18
  Time: 6:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>List Condiments</h1>
  <table border="1">
      <tr>
          <td>${name}</td>
          <td>
            <c:forEach items="${condiments}" var="c">
              ${c}
            </c:forEach>
          </td>
      </tr>
  </table>
</body>
</html>
