package com.deng.feign.service;

import com.deng.feign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping("/test/hello")
    String sayHi();
}
