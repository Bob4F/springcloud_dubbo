package com.cuco.dubbo.provider.service.impl;

import com.cuco.dubbo.service.ProviderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String hi() {
        return "Hi Spring Cloud Alibaba Dubbo";
    }
}