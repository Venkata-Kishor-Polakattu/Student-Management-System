<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get">
    <table style="margin-right: auto;margin-left: auto" border="1">
        <tr>
            <th>Student id</th><td>${student.sid}</td>
        </tr>
        <tr>
            <th>Student Name</th><td>${student.sname}</td>
        </tr>
        <tr>
            <th>Student Address</th><td>${student.saddr}</td>
        </tr>
        <tr>
            <th>Phone Number</th><td>${student.sphone}</td>
        </tr>
    </table>
</form>
</body>
</html>
