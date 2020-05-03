package com.web;

import com.service.GoodsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddGoodServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private GoodsService tl = new GoodsService();

    public AddGoodServlet(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //这里一定要设置json格式
        response.setContentType("application/json;charset=utf-8");
        // 获取前端发送的数据
        String sname=request.getParameter("sname");
        String sprice=request.getParameter("sprice");
        String materials=request.getParameter("materials");
        String introduction=request.getParameter("introduction");

        String l=tl.save(sname,sprice,materials,introduction);

        System.out.println(sname);
        System.out.println(sprice);
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        System.out.println("--------------"+l);
        out.println(l);
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
