package com.web;

import com.service.GoodsService;
import com.service.TuserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TuserService tl = new TuserService();

    public AddUserServlet(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //这里一定要设置json格式
        response.setContentType("application/json;charset=utf-8");
//        response.setContentType("text/html");
//        response.setCharacterEncoding("utf-8");
        // 获取前端发送的数据
        String uname=request.getParameter("uname");
        String upwd=request.getParameter("upwd");
        String realname=request.getParameter("realname");

        String l=tl.zhuce(uname,upwd,realname);

        System.out.println(uname);
        System.out.println(upwd);
        PrintWriter out=response.getWriter();
        out.println(l);
        System.out.println("--------------"+l);
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
