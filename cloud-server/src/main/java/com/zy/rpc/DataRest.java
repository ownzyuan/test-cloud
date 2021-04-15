package com.zy.rpc;


import com.zy.entity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zy.service.IUserService;

@RestController
@RequestMapping("/api/data")
public class DataRest {

    @Autowired
    private IUserService userService;

    @PostMapping( "/insert")
    public String insertData(@RequestBody UserDTO userDTO){
        userService.insert(userDTO);
        return "client insert";
    }

}
