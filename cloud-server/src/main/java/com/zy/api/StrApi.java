package com.zy.api;

import com.zy.api.hystrix.StrFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "cloud-server", fallback = StrFallback.class)
@RequestMapping(value = "/api/str")
public interface StrApi {

    @PostMapping("/ret")
    String returnStr();

}
