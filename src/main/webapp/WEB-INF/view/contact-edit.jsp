<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact edit page</title>
    </head>
    <body>
        <h2>Edit contact information here</h2></br></br>
        
        <form:form action="saveContact" modelAttribute="contact">
            
            <form:hidden path="id"/>
            
            Name <form:input path="name"/></br></br>
            Phone number <form:input path="phoneNumber"/></br></br>
            Email <form:input path="email"/></br></br>
            Description <form:input path="description"/></br></br>
            <input type="submit" value="Save">
        </form:form>
    </body>
</html>
