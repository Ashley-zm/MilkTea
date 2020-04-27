package com.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import static org.junit.Assert.*;

public class TmenuServiceTest {
    @Autowired
    private TmenuService tmenuService;
    @Test
    public void getByUid() {
        tmenuService.getByUid("1");
    }
}