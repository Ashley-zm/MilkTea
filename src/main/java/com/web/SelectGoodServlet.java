package com.web;

import com.service.GoodsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SelectGoodServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private GoodsService tl = new GoodsService();

    public SelectGoodServlet() {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        String sname = request.getParameter("sname");
        String materials = request.getParameter("materials");
        System.out.println("*****************"+sname);
        System.out.println(materials+"*****************");
//        处理业务
        String s = tl.select(sname, materials);
//        String s = tl.select("巧克力", "巧克力");
        System.out.println("============" + s + "===============");
//        输出
        //我这里是返回 json 类型
        response.getWriter().print(s);
//        JSONObject jsonObject = JSONObject.parseObject(s);
//        System.out.println("============" + jsonObject.values() + "===============");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
