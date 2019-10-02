<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/2/19
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<style>
  input[type=text] {
    width: 300px;
    font-size: 16px;
    border: 2px solid #ccc;
    border-radius: 4px;
    padding: 12px 10px 12px 10px;
  }
  #submit {
    border-radius: 2px;
    padding: 10px 32px;
    font-size: 16px;
  }
</style>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="get" action="/dictionary">
    <input type="text" name="englishWord" placeholder="Enter your word: "/>
    <input type="submit" id="submit" value="Search"/>
</form>
</body>
</html>
