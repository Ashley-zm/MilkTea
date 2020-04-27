package com.service;

import com.alibaba.fastjson.JSON;
import com.dao.DH;
import com.dao.GoodsDao;

import java.util.List;

public class GoodsService {
    private GoodsDao td=new GoodsDao();
    public String getall(){
        List l=td.getall();
        return JSON.toJSON(l).toString();
    }
    public String save(String sname,String sprice,String materials,String introduction){
        Boolean b=td.save(sname, sprice, materials, introduction);
        if (b){
            return "{\"msg\":\"success\"}";
        }else {
            return "{\"msg\":\"success\"}";
        }

    }
    public String update(String sname,String sprice,String materials,String introduction,String id){
        Boolean b=td.update(sname, sprice, materials, introduction,id);
        if (b){
            return "{\"msg\":\"success\"}";
        }else {
            return "{\"msg\":\"success\"}";
        }

    }

}
