package com.service;

import com.alibaba.fastjson.JSON;
import com.dao.TmenuDao;

import java.util.List;

public class TmenuService {
    private TmenuDao td=new TmenuDao();

    public String getByUid(String uid) {
        List l=td.getByUid(uid);
        return JSON.toJSON(l).toString();
    }
}
