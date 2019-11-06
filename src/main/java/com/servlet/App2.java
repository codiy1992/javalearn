package com.servlet;

import javax.annotation.MatchesPattern;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

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