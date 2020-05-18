package com.pojo;

import java.io.Serializable;

public class Tmenu implements Serializable {
    private int id;
    private String menutext;
    private String murl;

    public Tmenu(int id, String menutext, String murl) {
        this.id = id;
        this.menutext = menutext;
        this.murl = murl;
    }
    public Tmenu(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenutext() {
        return menutext;
    }

    public void setMenutext(String menutext) {
        this.menutext = menutext;
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }

    @Override
    public String toString() {
        return "Tmenu{" +
                "id=" + id +
                ", menutext='" + menutext + '\'' +
                ", murl='" + murl + '\'' +
                '}';
    }
}
