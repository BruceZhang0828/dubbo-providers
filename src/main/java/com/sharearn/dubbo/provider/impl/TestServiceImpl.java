package com.sharearn.dubbo.provider.impl;

import com.sharearn.dubbo.romote.TestService;

/**
 * Created by deepbay on 2018/5/30.
 */
//@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {

        return "Hello"+name+"!";
    }
}
