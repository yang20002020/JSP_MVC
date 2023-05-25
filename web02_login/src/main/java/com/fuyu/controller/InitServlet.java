package com.fuyu.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet()
public class InitServlet extends HttpServlet {
    /*
    //初始化的方法
     */
    @Override
    public void init() throws ServletException {

        int count=0;
        //将这个值存入到ServletContext域中。
        this.getServletContext().setAttribute("count",count);

    }
}
