package com.web;

import com.service.TmenuService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TmenuServlet extends HttpServlet {

    private TmenuService tl=new TmenuService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uid=request.getParameter("uid");
        String l=tl.getByUid(uid);
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println(l);
        out.flush();
        out.close();
//        request.setAttribute("table", l);
//        request.getRequestDispatcher("/table.html").forward(request, response);

    }
}
