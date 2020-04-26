package com.cuco.dubbo.provider.service.impl;

import com.cuco.dubbo.service.FooService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooServiceImpl implements FooService {
    @Override
    public String foo() {
        return "Foo Spring Cloud Alibaba Dubbo";
    }
}