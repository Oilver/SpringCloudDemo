package com.deng.feign.web.controller;

import com.deng.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String sayHi(){
        return schedualServiceHi.sayHi();
    }
}
