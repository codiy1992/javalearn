package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws  ServletException, java.io.IOException
    {
        res.getWriter().println("aaaaaaaaaaaaaaaa");
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws  ServletException, java.io.IOException
    {
        res.getWriter().println("aaaaaaaaaaaaaaaa");
    }
}