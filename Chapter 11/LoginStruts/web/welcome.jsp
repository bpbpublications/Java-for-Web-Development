<%-- 
    Document   : welcome.jsp
    Created on : 1 Jan, 2022, 1:32:40 PM
    Author     : AMIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>welcome</h1>
        <%@ taglib uri="/struts-tags" prefix="s" %>
        <h1> <s:property value="uname"/><br/>  </h1>
    </body>
</html>
