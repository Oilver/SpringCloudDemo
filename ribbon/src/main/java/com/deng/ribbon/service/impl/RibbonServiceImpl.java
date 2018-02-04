package com.deng.ribbon.service.impl;

import com.deng.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl implements RibbonService{
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过restTemplate.getForObject方法，service-ribbon 就可以调用service-hi的方法了。并且在调用的工程中并之需要写服务的名，而不是具体的ip.
     * @return
     */
    public String hiService() {
        //return restTemplate.getForObject("http://SERVICE-HI/test/hello",String.class);
        return restTemplate.getForObject("http://SERVICE-HI/test/hello",String.class);
    }
}
