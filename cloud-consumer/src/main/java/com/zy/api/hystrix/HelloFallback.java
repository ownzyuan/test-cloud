package com.zy.api.hystrix;

import com.zy.api.HelloApi;
import org.springframework.stereotype.Service;

@Service
public class HelloFallback implements HelloApi {
    public String clientHello() {
        return "hello fallback";
    }
}
