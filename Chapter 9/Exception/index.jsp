<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPEhtml>
<html>
    <head>

<title>JSP Page</title>
</head>
<body>
<h1>Welcome to the is  Error page example </h1>
<%@ page errorPage="error.jsp" %>   
<%
String s=null;
char j=s.charAt(0);
out.println(j);
%>

</body>
</html>

