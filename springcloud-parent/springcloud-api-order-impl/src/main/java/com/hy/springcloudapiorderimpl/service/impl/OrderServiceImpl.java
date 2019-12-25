package com.hy.springcloudapiorderimpl.service.impl;

import com.hy.springcloudapimemberservice.entity.User;
import com.hy.springcloudapiorderimpl.feign.MemberServiceFeign;
import com.hy.springcloudapiorderservice.service.OrderService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl implements OrderService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @RequestMapping("/orderToMember")
    public String orderToMember(String name) {
        User user = memberServiceFeign.getMember(name);
        return user == null ? "没有获取用户信息" : user.toString();
    }
}
