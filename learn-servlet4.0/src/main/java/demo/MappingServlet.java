package demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/path/", "/path/to/*", "*.ext", "/path/file.ext"})
public class MappingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // 4.0开始支持获取HttpServletMapping
        HttpServletMapping servletMapping = request.getHttpServletMapping();
        response.getWriter()
                .append("<html><body>")
                .append("Value Matched: <b>").append(servletMapping.getMatchValue())
                .append("</b><br />")
                .append("Pattern Used: <b>").append(servletMapping.getPattern())
                .append("</b><br />")
                .append("MappingMatched: <b>").append(servletMapping.getMappingMatch().name())
                .append("</b><br />")
                .append("Servlet Name: <b>").append(servletMapping.getServletName())
                .append("</body></html>");
    }
}
