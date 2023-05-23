package fuyu;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*

 */
@WebServlet(urlPatterns = "/servletDemo4")
public class servletDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //请求转发的方式  跳转到jsp页面
        // test1(request,resp);
        //重定向方法
          test2(request,resp);
    }
    private void test1(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //向request域保存数据
        request.setAttribute("name","张三");
        //请求转发的方式  跳转到jsp页面
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("/test/demo1.jsp");
        requestDispatcher.forward(request,resp);
    }
    private void test2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //向request域保存数据
        request.setAttribute("name","张三");
        //重定向方法
        response.sendRedirect("/jspDemo4/test/demo1.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
