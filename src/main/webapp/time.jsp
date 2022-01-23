<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <%@include file="incude/menu.jsp" %>
    <div>Request Method: <%=request.getMethod()%></div>
    <div><%=request.getServletContext().getResource("/")%></div>
    Current time:
    <%
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        out.println(format.format(new Date()));
    %>
</body>
</html>