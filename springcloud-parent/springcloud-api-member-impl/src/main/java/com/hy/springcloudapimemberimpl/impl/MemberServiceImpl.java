package com.hy.springcloudapimemberimpl.impl;

import com.hy.springcloudapimemberservice.entity.User;
import com.hy.springcloudapimemberservice.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {

    @RequestMapping(value = "/getMember")
    public User getMember(@RequestParam("name") String name) {
        User user = new User();
        user.setUsername(name);
        user.setAge(23);
        return user;
    }
}
