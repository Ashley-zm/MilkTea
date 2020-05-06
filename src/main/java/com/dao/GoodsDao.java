package com.dao;

import com.pojo.Goods;
import com.pojo.Page;

import java.util.List;

public class GoodsDao {
//    查询所有商品
    public List getall(Page page){
        //start：从那条开始查，size：每页查询的数量
        //报错：start和size是私有的
        String sql="select * from goods limit "+page.start+","+page.size;
        return DH.getall(sql,new Goods(),new String[] {});
    }
//    模糊查询
    public List select(String sname,String materials){
            String sql=" SELECT * FROM goods WHERE sname LIKE \"%\"?\"%\" OR materials LIKE \"%\"?\"%\" ";
        return DH.getall(sql,new Goods(),new String[] {sname,materials});
    }
//    插入商品
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
//    更新商品
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
//    删除商品
public Boolean delete(String id){
    String sql="DELETE FROM goods where id=?";
    int num = DH.update(sql, new String[]{id});
    if(num>0){
        return true;
    }
    else {
        return false;
    }

}
//    获取所有数据总数
    //报错Number无法转换成int--修改.intValue()
    public int getTotalCount(){
        String sql=" SELECT COUNT(*) FROM goods";
        int count=DH.getcount(sql).intValue();
        return count;

    }

}
