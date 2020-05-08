package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DemoServlet", urlPatterns = "/*")
public class DemoServlet extends HttpServlet {
    public static final String HTML_START="<html><body>";
    public static final String HTML_END="</body></html>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println(HTML_START + "<h1>helloworld</h1>"+HTML_END);
    }
}
