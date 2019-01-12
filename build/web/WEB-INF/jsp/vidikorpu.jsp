<%-- 
    Document   : vidikorpu
    Created on : Sep 9, 2017, 3:00:30 PM
    Author     : Kameni
--%>
<%--taglib regularan i taglib za vreme--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ovo ste kupili</h1>
        <ol>   
         <c:forEach items="${korpe}" var="k">
                 
                    <li>${k.kpKupljeno}</li>
                    
                    
                    
                   
                   
               
            </c:forEach>
    </ol>
    </body>
</html>
