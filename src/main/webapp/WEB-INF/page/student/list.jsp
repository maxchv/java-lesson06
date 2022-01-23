<%@ page import="org.itstep.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student list</title>
    <link rel="stylesheet" href="https://unpkg.com/mvp.css">
</head>
<body>
    <table>
        <caption>Students</caption>
        <thead>
            <tr>
                <td>#</td>
                <td>Имя</td>
                <td>Фамилия</td>
                <td>Группа</td>
            </tr>
        </thead>
        <tbody>
            <% List<Student> students = (List<Student>) request.getAttribute("students");
                for(int i=0; i<students.size(); i++) { %>
                <tr>
                    <td><%=i+1%></td>
                    <td><%=students.get(i).getFirstName()%></td>
                    <td><%=students.get(i).getLastName()%></td>
                    <td><%=students.get(i).getGroup()%></td>
                </tr>
            <%}%>
        </tbody>
    </table>
</body>
</html>
