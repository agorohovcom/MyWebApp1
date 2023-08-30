<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Contacts</title>
    </head>
    <body>
        <h2>Here are all contacts</h2>
        </br>
        </br>

        <table>
            <tr>
                <th>Name</th>
                <th>Phone number</th>
                <th>Email</th>
                <th>Description</th>
                <th>Operations</th>
            </tr>

            <c:forEach var="cntct" items="${allContacts}">
                
                <c:url var="editButton" value="/updateContact">
                    <c:param name="cId" value="${cntct.id}"/>
                </c:url>
                <c:url var="deleteButton" value="/deleteContact">
                    <c:param name="cId" value="${cntct.id}"/>
                </c:url>
                
                <tr>
                    <td>${cntct.name}</td>
                    <td>${cntct.phoneNumber}</td>
                    <td>${cntct.email}</td>
                    <td>${cntct.description}</td>
                    
                    <td>
                        <input type="button" value="Edit"
                               onclick="window.location.href='${editButton}'"/>
                        <input type="button" value="Delete"
                               onclick="window.location.href='${deleteButton}'"/>
                    </td>
                </tr>

            </c:forEach>
                
        </table>
        </br>
        <input type="button" value="New contact" 
               onClick="window.location.href='addNewContact'"/>
    </body>
</html>
