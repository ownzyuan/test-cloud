package com.zy.rpc;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class HelloRest {

    @PostMapping("/hello")
    public String clientHello(){
        return "client hello";
    }

}
