
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="./update">
    <table style="margin-left: auto;margin-right: auto">
        <tr>
            <th>Student id</th>
            <td>:</td>
            <td><input name="sid" type="number" value="${student.sid}" readonly="readonly"/></td>
        </tr>
        <tr>
            <th>Student Name</th>
            <td>:</td>
            <td><input type="text" name="sname" value="${student.sname}"/></td>
        </tr>
        <tr>
            <th>Address</th>
            <td>:</td>
            <td><input type="text" name="saddr" value="${student.saddr}"/> </td>
        </tr>
        <tr>
            <th>Phone Number</th>
            <td>:</td>
            <td><input type="number" name="sphone" value="${student.sphone}"/> </td>
        </tr>
        <tr>
            <td colspan="3" style="text-align: center"><input type="submit" value="Update"></td>
        </tr>
    </table>
</form>
</body>
</html>
