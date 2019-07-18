package com.ws.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class TestServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().println("test");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
