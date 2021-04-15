package com.zy.api.hystrix;

import com.zy.api.StrApi01;
import org.springframework.stereotype.Service;

@Service
public class StrFallback01 implements StrApi01 {
    @Override
    public String returnStr01() {
        return "api str";
    }
}
