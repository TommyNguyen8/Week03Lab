<%-- 
    Document   : agecalculator.jsp
    Created on : Sep 21, 2020, 8:01:09 PM
    Author     : 791662
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="number"><br>
            <input type="submit" value="Age next birthday"><br>
        </form>
        <p>
            ${message}
        </p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
