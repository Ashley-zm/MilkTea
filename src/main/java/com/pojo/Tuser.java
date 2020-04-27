package com.pojo;

import java.io.Serializable;

/**
 *
 */
public class Tuser implements Serializable {
    private int id;
    private  String uname;
    private  String upwd;
    private  String realname;

    public Tuser(int id, String uname, String upwd, String realname) {
        this.id = id;
        this.uname = uname;
        this.upwd = upwd;
        this.realname = realname;
    }
    public  Tuser(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "Tuser{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}
