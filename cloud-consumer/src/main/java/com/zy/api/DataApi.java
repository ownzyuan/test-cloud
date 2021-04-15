package com.zy.api;

import com.zy.api.hystrix.DataFallback;
import com.zy.entity.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "cloud-server", fallback = DataFallback.class)
@RequestMapping(value = "/api/data")
public interface DataApi {

    @PostMapping("/insert")
    String insertData(UserDTO userDTO);

}
