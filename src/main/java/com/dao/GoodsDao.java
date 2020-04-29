package com.dao;

import com.pojo.Goods;

import java.util.List;

public class GoodsDao {
    public List getall(){
        String sql="select * from goods";
        return DH.getall(sql,new Goods(),new String[] {});
    }
    public Boolean save(String sname,String sprice,String materials,String introduction){
        String sql="insert into goods(sname ,sprice,materials,introduction) values (?,?,?,?)";
        int num = DH.update(sql, new String[]{sname, sprice, materials, introduction});
        if (num>0){
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean update(String sname,String sprice,String materials,String introduction,String id){
        String sql="update goods set sname=?,sprice=?,materials=?,introduction=? where id=?";
        int num = DH.update(sql, new String[]{sname, sprice, materials, introduction,id});
        if(num>0){
            return true;
        }
        else {
            return false;
        }

    }
}
