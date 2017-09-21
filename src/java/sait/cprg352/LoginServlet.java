/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NoahFerrier
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("usrname");
        String password = request.getParameter("psswd");

        username = username.toLowerCase();
        password = password.toLowerCase();

        request.setAttribute("username", username);
        request.setAttribute("password", password);

        UserService us;
        us = new UserService();

        if (username.trim().isEmpty() && password.trim().isEmpty()) {
            request.setAttribute("message", "both values are required");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else if (!us.login(username, password)) {
            request.setAttribute("message", "invalid username or password");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
        }
    }

}
