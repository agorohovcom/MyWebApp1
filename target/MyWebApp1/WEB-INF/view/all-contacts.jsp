<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Contacts</title>
    </head>
    <body>
        <h2>Here are the all contacts</h2>
        </br>
        </br>

        <table>
            <tr>
                <th>Name</th>
                <th>Phone number</th>
                <th>Email</th>
                <th>Description</th>
            </tr>

            <c:forEach var="contact" items="${allContacts}">
                <tr>
                    <td>${contact.name}</td>
                    <td>${contact.phoneNumber}</td>
                    <td>${contact.email}</td>
                    <td>${contact.description}</td>
                </tr>

            </c:forEach>
                
        </table>
    </body>
</html>
