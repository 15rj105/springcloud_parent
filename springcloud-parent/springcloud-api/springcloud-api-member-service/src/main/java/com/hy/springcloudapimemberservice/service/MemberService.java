package com.hy.springcloudapimemberservice.service;

import com.hy.springcloudapimemberservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient
public interface MemberService {
    @GetMapping("/getMember")
    User getMember(@RequestParam("name") String name);
}
