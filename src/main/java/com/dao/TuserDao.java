package com.dao;

import com.pojo.Tuser;
import java.util.List;

public class TuserDao {
    public Tuser login(String uname,String upwd){
        String sql="select * from tuser where uname=? and upwd=? ";
        List gl = DH.getall(sql, new Tuser(), new String[]{uname, upwd});
        if (gl.size()>0){
            return (Tuser) gl.get(0);
        }else {
            return null;
        }
    }
    public Tuser login(String uid){
//        多表查询：inner join 是内关联、子查询
//        "select uid from "
        return null;
    }
    public Boolean zhuce(String uname,String upwd,String realname){
        String sql="insert into tuser (uname,upwdrealname) values(?,?,?) ";
        int update = DH.update(sql, new String[]{uname, upwd, realname});
        if (update>0){
            return true;
        }else {
            return false;
        }
    }
    public Boolean changePwd(String id,String newpwd){
        return null;
    }
}
