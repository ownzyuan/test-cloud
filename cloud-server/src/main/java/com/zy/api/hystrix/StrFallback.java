package com.zy.api.hystrix;

import com.zy.api.StrApi;
import org.springframework.stereotype.Service;

@Service
public class StrFallback implements StrApi {
    @Override
    public String returnStr() {
        return "api str";
    }
}
