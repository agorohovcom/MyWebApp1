<%-- 
    Document   : first-view
    Created on : 20 авг. 2023 г., 13:24:28
    Author     : agorohov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MyWebApp1 first-view Welcome Page</title>
    </head>
    <body>
        <h1>Здорова!</h1>
        </br>
        </br>
        <h2>Там ниже кнопочка. Жмакни, и получишь список контактов из БД =)</h2>
        </br>
        </br>
        
        <input type="button" value="Contacts"
               onclick="window.location.href='allContacts'"/>
    </body>
</html>
