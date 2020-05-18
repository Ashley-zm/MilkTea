package com.pojo;

import java.io.Serializable;

public class Trole implements Serializable {
    private int id;
    private  String rolename;

    public Trole(int id, String rolename) {
        this.id = id;
        this.rolename = rolename;
    }
    public  Trole(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "Trole{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
