package com.bkex.fallback;

import com.bkex.service.TestService;
import feign.hystrix.FallbackFactory;

/**
 * 服务降级
 */
public class TestServiceFallback implements FallbackFactory<TestServiceFallback>, TestService {

    private Throwable throwable;

    public TestServiceFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public String echo() {

        return "consumer-fallback-default-str" + throwable.getMessage();
    }

    @Override
    public TestServiceFallback create(Throwable throwable) {
        return new TestServiceFallback(throwable);
    }
}
