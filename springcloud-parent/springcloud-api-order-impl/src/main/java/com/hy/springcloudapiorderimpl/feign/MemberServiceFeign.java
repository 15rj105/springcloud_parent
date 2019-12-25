package com.hy.springcloudapiorderimpl.feign;

import com.hy.springcloudapimemberservice.service.MemberService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("memberService")
public interface MemberServiceFeign extends MemberService {

}
