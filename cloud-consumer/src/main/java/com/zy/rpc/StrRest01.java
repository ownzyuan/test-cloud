package com.zy.rpc;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/str")
public class StrRest01 {

    @PostMapping("/ret")
    public String returnStr01(){
        return "rpc str";
    }

}
