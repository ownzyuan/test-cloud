package com.zy.api;

import com.zy.api.hystrix.HelloFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cloud-server", fallback = HelloFallback.class)
public interface HelloApi {

    @RequestMapping(value = "/api/client/hello", method = RequestMethod.POST)
    String clientHello();

}
