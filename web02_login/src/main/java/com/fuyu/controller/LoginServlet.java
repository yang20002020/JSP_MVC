package com.fuyu.controller;
import com.fuyu.domain.User;
import com.fuyu.model.UserModel;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*

 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try {
               // 1.接收数据
               // 处理中文乱码
               request.setCharacterEncoding("UTF-8");
               String username = request.getParameter("username");
               String password = request.getParameter("password");
               // 2.封装数据
               User user = new User();
               user.setUsername(username);
               user.setPassword(password);
               // 3.处理数据
               UserModel userModel = new UserModel();
               User existUser = userModel.login(user);
               // 4.页面跳转
               if (existUser == null) {
                   // 登录失败
                   // 向request域中保存一个错误信息：
                   request.setAttribute("msg", "用户名或密码错误！");
                   // 使用请求转发进行页面跳转
                   request.getRequestDispatcher("/login.jsp").forward(request, response);
               } else {
                   // 登录成功
                   // 重定向到成功页面
                   response.sendRedirect("/web02_login/success.jsp");
               }
       }catch (Exception e){
          e.printStackTrace();
       }

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}