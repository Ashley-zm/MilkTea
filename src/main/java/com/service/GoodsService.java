package com.service;

import com.alibaba.fastjson.JSON;
import com.dao.GoodsDao;
import com.pojo.Page;

import java.util.List;

public class GoodsService {
    private GoodsDao td=new GoodsDao();
//    获取全部商品
    public String getall(Page page){
        List l=td.getall(page);
        return JSON.toJSON(l).toString();
    }
//    模糊查询
    public  String select(String sname,String materials){
        List select = td.select(sname, materials);
        return JSON.toJSON(select).toString();
    }
//    添加商品
    public String save(String sname,String sprice,String materials,String introduction){
        Boolean b=td.save(sname, sprice, materials, introduction);
        if (b){
            return "{\"msg\":\"success\"}";
        }else {
            return "{\"msg\":\"error\"}";
        }

    }
//    修改商品
    public String update(String sname,String sprice,String materials,String introduction,String id){
        Boolean b=td.update(sname, sprice, materials, introduction,id);
        if (b){
            return "{\"msg\":\"success\"}";
        }else {
            return "{\"msg\":\"error\"}";
        }

    }
    //获取所有的商品的总数量
    public int getTotalCount(){
        return td.getTotalCount();
    }





}
