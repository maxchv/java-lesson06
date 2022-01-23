package org.itstep.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/page/form.jsp");
        requestDispatcher.forward(req, resp);
//        resp.setContentType("text/html");
//        resp.getWriter().println("<h1>Hello World</h1>" +
//                "<form method='post'>" +
//                "<input name='username' placeholder='Username'/>" +
//                "<input type='submit'/>" +
//                "</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("username", req.getParameter("username"));
        req.getRequestDispatcher("/WEB-INF/page/hello.jsp").forward(req, resp);
//        resp.setContentType("text/html");
//        String username = req.getParameter("username");
//        resp.getWriter().println("<div>Your name: " + username + "</div>");
    }
}
