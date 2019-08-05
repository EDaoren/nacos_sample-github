package com.edaoren.controller;

import com.edaoren.NacosApi.version.ServiceVersionConstants;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edaoren.NacosApi.HelloProvider;
import com.edaoren.NacosApi.HelloProvider2;

@RestController
public class DemoController {


    @Reference(version = ServiceVersionConstants.VERSION, check = false, interfaceName = "helloProvider", url = "dubbo://localhost:20880")
    private HelloProvider helloProvider;


    @Reference(version = ServiceVersionConstants.VERSION, check = false, group = "provider1")
    private HelloProvider2 helloProvider2;

    @GetMapping("/hello")
    public String hello(String name) {
        System.out.println("helloProvider = " + helloProvider);
        if (helloProvider == null) {
            return "hello failed";
        }
        return helloProvider.hello(name);
    }


    @GetMapping("/hello2")
    public String hello2(String name) {
        System.out.println("helloProvider = " + helloProvider2);
        if (helloProvider2 == null) {
            return "hello failed";
        }
        return helloProvider2.hello(name);
    }


}
