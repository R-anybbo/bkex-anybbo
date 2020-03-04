package com.bkex.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class TestServiceFallbackFactory implements FallbackFactory<TestServiceFallback> {

    @Override
    public TestServiceFallback create(Throwable throwable) {

        return new TestServiceFallback(throwable);
    }
}
