<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPEhtml>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>Welcome to the Error page</h1><br>
<%@page isErrorPage="true"%>
<%=exception%>

</body>
</html>

