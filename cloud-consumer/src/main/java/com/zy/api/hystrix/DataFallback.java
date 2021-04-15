package com.zy.api.hystrix;

import com.zy.api.DataApi;
import com.zy.entity.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class DataFallback implements DataApi {

    @Override
    public String insertData(UserDTO userDTO) {
        return "api insert";
    }
}
