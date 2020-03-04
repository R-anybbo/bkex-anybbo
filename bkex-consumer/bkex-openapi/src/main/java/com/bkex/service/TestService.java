package com.bkex.service;

import com.bkex.fallback.TestServiceFallback;
import com.bkex.fallback.TestServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "${bkex.account}", fallbackFactory = TestServiceFallbackFactory.class)
public interface TestService {

    @GetMapping(value = "/auth/user")
    String echo();

}
