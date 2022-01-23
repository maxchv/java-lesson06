package org.itstep.servlet;

import org.itstep.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentServlet extends HttpServlet {

    List<Student> students = new CopyOnWriteArrayList<>();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/page/student/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Student student = new Student(req.getParameter("firstName"), req.getParameter("lastName"), req.getParameter("group"));
        students.add(student);
        req.setAttribute("students", students);
        req.getRequestDispatcher("/WEB-INF/page/student/list.jsp").forward(req, resp);
    }
}
