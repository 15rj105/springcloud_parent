package com.hy.springcloudapiorderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

public interface OrderService {
    @GetMapping("/orderToMember")
    public String orderToMember(String name);
}
