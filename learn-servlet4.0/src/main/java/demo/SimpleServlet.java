package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;
import java.io.IOException;

@WebServlet("/demo")
public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // 预先将头像推送到前端(需要HTTP2.0的支持)
        PushBuilder pushBuilder = request.newPushBuilder();
        if (pushBuilder != null) {
            pushBuilder.path("images/avatar.jpg").push();
        }
        // 跳转到展示头像的jsp页面
        this.getServletContext().getRequestDispatcher("/avatar.jsp").forward(request, response);
    }
}