<%-- 
    Document   : welcome
    Created on : Jul 6, 2019, 11:35:50 AM
    Author     : s206e19
--%>


<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        
       <c:out value="${message}"/>

    </body>
</html>

