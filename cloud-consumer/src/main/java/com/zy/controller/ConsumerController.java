package com.zy.controller;

import com.zy.api.StrApi01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private StrApi01 strApi01;

    @PostMapping("/str")
    public String returnStr01(){
        return strApi01.returnStr01();
    }

}
