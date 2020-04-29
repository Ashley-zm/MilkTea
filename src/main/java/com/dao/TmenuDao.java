package com.dao;

import com.pojo.Tmenu;

import java.util.List;

public class TmenuDao {
    public List getByUid(String uid){
//        使用的是inner json,根据tmenu，trm，tur(rid)的id来查询，返回tmenu对象
        String sql="SELECT tmenu.* FROM tmenu INNER JOIN trm ON tmenu.id=trm.id INNER JOIN tur ON tmenu.id=tur.rid WHERE tur.uid=?";
        return DH.getall(sql,new Tmenu(),new String[]{uid});
    }
}
