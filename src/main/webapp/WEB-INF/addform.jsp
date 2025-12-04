<%--
  Created by IntelliJ IDEA.
  User: venka
  Date: 14-07-2025
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="./add">
    <table style="margin-left: auto;margin-right: auto">
        <tr>
            <td>Student Id</td>
            <td>:</td>
            <td><input type="number" name="sid"></td>
        </tr>
        <tr>
            <td>Student Name</td>
            <td>:</td>
            <td><input type="text" name="sname"></td>
        </tr>
        <tr>
            <td>Student Address</td>
            <td>:</td>
            <td><input type="text" name="saddr"></td>
        </tr>
        <tr>
            <td>Phone Number</td>
            <td>:</td>
            <td><input type="number" name="sphone"></td>
        </tr>
        <tr>
            <td colspan="3" style="text-align: center"><input type="submit" value="Submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
