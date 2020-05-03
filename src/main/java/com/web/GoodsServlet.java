package com.web;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.service.GoodsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//web也就是controller
public class GoodsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private GoodsService tl = new GoodsService();

    public GoodsServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String l=tl.getall();
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
//        把json字符串转换成json对象
//        JSONObject lj = JSON.parse(l);
//        JSONArray listArray=JSONArray.fromObject(lists);
        System.out.println("--------------"+l);
        out.println(l);
//        flush()意思是把缓冲区的内容强制的写出
//        flush方法一般是程序写入完成时执行。随后跟着close方法。
        out.flush();
        out.close();
    }
}
