package com.cuco.dubbo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider")
public interface ProviderService {

    @GetMapping("/hi")
    String hi();
}