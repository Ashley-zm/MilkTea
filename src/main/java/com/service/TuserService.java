package com.service;

import com.alibaba.fastjson.JSON;
import com.dao.TuserDao;
import com.pojo.Tuser;

public class TuserService {
    private TuserDao td=new TuserDao();
    public String login(String uname,String upwd){
        Tuser u1= td.login(uname, upwd);
        if (u1==null){
            return "{\"msg\":\"error\"}";
        }else {
            return JSON.toJSON(u1).toString();

        }
    }
}
