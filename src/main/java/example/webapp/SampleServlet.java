package com.example.webapp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // out.println("<html><body>");
        // out.println("<h2>Hello, Web App!</h2>");
        // out.println("</body></html>");
        out.println("<html><body><h2>Hello, Web App!</h2></body></html>");
    }
}
