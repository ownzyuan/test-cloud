package com.zy.api;

import com.zy.api.hystrix.StrFallback01;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "cloud-server", fallback = StrFallback01.class)
public interface StrApi01 {

    @PostMapping("/api/str/ret")
    String returnStr01();

}
