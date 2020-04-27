package com.web;

import com.alibaba.fastjson.JSONObject;
import com.service.TuserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginServlet extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;
    private TuserService ts = new TuserService();

    public loginServlet() {
        super();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");//获取操作
        String uname = request.getParameter("uname");
        System.out.println(action);
        System.out.println(uname);
        if ("login".equals(action)) {//用户登陆
            this.login(request, response);
        }
    }

    protected void login(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control", "no-cache");
        response.setCharacterEncoding("utf-8");
        //这里一定要设置json格式
        response.setContentType("application/json;charset=utf-8");
        // 获取前端发送的数据
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
//        处理业务
        String s = ts.login(uname, upwd);
        System.out.println("============" + s + "===============");
//        输出
        //我这里是返回 json 类型
        response.getWriter().print(s);
        JSONObject jsonObject = JSONObject.parseObject(s);
        System.out.println("============" + jsonObject.values() + "===============");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
/*
生命周期
1.实例化
2.初始化
3.请求处理
4.销毁
* */
