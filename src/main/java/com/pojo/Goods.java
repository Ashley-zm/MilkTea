package com.pojo;

import java.io.Serializable;

public class Goods implements Serializable {
    private int id;
    private String sname;
    private int sprice;
    private String materials;
    private String introduction;

    public Goods(int id, String sname, int sprice, String materials, String introduction) {
        this.id = id;
        this.sname = sname;
        this.sprice = sprice;
        this.materials = materials;
        this.introduction = introduction;
    }
    public Goods(){}

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", sprice=" + sprice +
                ", materials='" + materials + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSprice() {
        return sprice;
    }

    public void setSprice(int sprice) {
        this.sprice = sprice;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
