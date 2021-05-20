package com.tian.testconsumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author muyang.tian
 * @date 2021/5/20 14:01
 */
@RestController
public class consumer {

    @Resource
    private provider provider;

    @GetMapping("/hi-feign")
    public String hiFeign(){
        return provider.hi("feign");
    }
}
