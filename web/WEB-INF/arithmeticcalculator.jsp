<%-- 
    Document   : arithmeticcalculator.jsp
    Created on : Sep 21, 2020, 9:12:06 PM
    Author     : 791662
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first"><br>
            Second: <input type="text" name="second"><br>
            <input type="submit" value="+">
            <input type="submit" value="-">
            <input type="submit" value="*">
            <input type="submit" value="%"><br>
        </form>
        <p>
            Result: ${message}
        </p>
        <a href="age">Age Calculator</a>
    </body>
</html>
