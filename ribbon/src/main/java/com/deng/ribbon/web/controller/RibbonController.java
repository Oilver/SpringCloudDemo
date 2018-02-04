package com.deng.ribbon.web.controller;


import com.deng.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping(value = "/test/ribbon")
    public String test(){
      return ribbonService.hiService();
    }
}
