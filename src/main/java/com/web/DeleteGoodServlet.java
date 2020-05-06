package com.web;

import com.service.GoodsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteGoodServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private GoodsService tl = new GoodsService();

    public DeleteGoodServlet(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//这里一定要设置json格式
        response.setContentType("application/json;charset=utf-8");
        // 获取前端发送的数据
        String id=request.getParameter("id");

        String l=tl.delete(id);

        System.out.println(id);
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println(l);
        System.out.println("--------------"+l);
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
