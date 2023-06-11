package com.example.webapp.test;

import com.example.webapp.SampleServlet;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class SampleServletTest {

    @Test
    public void testSampleServlet() throws Exception {
        // Create mock objects for HttpServletRequest and HttpServletResponse
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

        // Create a StringWriter to capture the response output
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);

        // Set up mock behavior for HttpServletRequest and HttpServletResponse
        Mockito.when(response.getWriter()).thenReturn(writer);

        // Create an instance of the SampleServlet
        SampleServlet servlet = new SampleServlet();

        // Call the doGet() method of the servlet
        servlet.doGet(request, response);

        // Flush and close the writer
        writer.flush();
        writer.close();

        // Verify the response
        String expectedResponse = "<html><body><h2>Hello, Web App!</h2></body></html>";
        assertEquals(expectedResponse, stringWriter.toString().trim());
    }
}
