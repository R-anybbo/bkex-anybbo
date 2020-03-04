package com.bkex.controller;

import com.bkex.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private TestService testService;

    /**
     * 直接调用远程服务
     * @param str   参数1
     * @return      String
     */
    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str) {

        return restTemplate.getForObject("http://bkex-account/auth/user", String.class);
    }

    /**
     * 使用feign消费服务 就像调用本地方法一样的
     * @return  String
     */
    @GetMapping(value = "/echo-feign")
    public String echoFeign() {

        return testService.echo();
    }
}
