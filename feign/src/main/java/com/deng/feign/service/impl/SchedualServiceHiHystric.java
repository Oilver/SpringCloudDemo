package com.deng.feign.service.impl;

import com.deng.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHi() {
        return "sorry";
    }
}
