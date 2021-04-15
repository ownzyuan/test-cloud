package com.zy.controller;

import com.zy.api.StrApi;
import com.zy.entity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

//    @Autowired
//    private DataApi dataApi;
//
//    @PostMapping("/insert")
//    public String insertData(@RequestBody UserDTO userDTO){
//        return dataApi.insertData(userDTO);
//    }

    @Autowired
    private StrApi strApi;

    @PostMapping("/str")
    public String insertData(){
        return strApi.returnStr();
    }

}
