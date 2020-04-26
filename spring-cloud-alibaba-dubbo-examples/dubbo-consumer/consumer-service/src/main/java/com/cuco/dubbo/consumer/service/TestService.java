package com.cuco.dubbo.consumer.service;

import com.cuco.dubbo.service.FooService;
import com.cuco.dubbo.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {

    @Autowired
    private ProviderService providerService;

    @Autowired
    private FooService fooService;

    @GetMapping("/test")
    public String test() {
        return providerService.hi();
    }

    @GetMapping("/test/foo")
    public String testFoo() {
        return fooService.foo();
    }
}