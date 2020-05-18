package com.service;

import com.alibaba.fastjson.JSON;
import com.dao.TuserDao;
import com.pojo.Tuser;

public class TuserService {
    private TuserDao td=new TuserDao();

    public String login(String uname,String upwd){
        Tuser u1= td.login(uname, upwd);

//    验证用户是否已经登录
        Singleton s = Singleton.getsl();
        Boolean s1 = s.isol(u1.getId() + "");
        if (s1){
            if (u1==null){
                return "{\"msg\":\"error\"}";
            }else {
                return JSON.toJSON(u1).toString();
            }
        }else {
            return "{\"msg\":\"loading\"}";
        }
    }

    public String zhuce(String uname,String upwd,String realname){
        Boolean zc = td.zhuce(uname, upwd, realname);
        if(zc==null){
            return "{\"msg\":\"error\"}";
        }else {
            return JSON.toJSON(zc).toString();

        }

    }

    public String changePwd(String id,String newpwd){
        Boolean cp = td.changePwd(id, newpwd);
        if(cp==null){
            return "{\"msg\":\"error\"}";
        }else {
            return JSON.toJSON(cp).toString();

        }

    }
}
