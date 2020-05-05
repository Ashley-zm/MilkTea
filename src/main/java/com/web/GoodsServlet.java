package com.web;


//import com.alibaba.fastjson.JSONObject;
import com.service.GoodsService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import  com.pojo.Page;
//web也就是controller
public class GoodsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private GoodsService tl = new GoodsService();
    private GoodsService ct = new GoodsService();

    public GoodsServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        int page1 = Integer.parseInt(request.getParameter("page"));
        int limit = Integer.parseInt(request.getParameter("limit"));
        System.out.println("page1------------------"+page1);
        System.out.println("limit*******************"+limit);
/***
 *total   总记录数
 *currentpage    当前页
 *pagesize    每页显示多少条
 *public Page(int total,int currentpage,int pagesize)
 *Page page = new Page(pageCount, currentPage, pageSize);
  */
        Page page=new Page(tl.getTotalCount(),page1,limit);
        System.out.println("page------------------"+page);
        int totalCount = ct.getTotalCount();
        String cout=String.valueOf(totalCount);
        request.setAttribute("count",cout);

//        //查询所有商品
        String l=tl.getall(page);

        PrintWriter out=response.getWriter();
        System.out.println("--------------"+l);
        out.println(l);
//        flush()意思是把缓冲区的内容强制的写出
//        flush方法一般是程序写入完成时执行。随后跟着close方法。
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
