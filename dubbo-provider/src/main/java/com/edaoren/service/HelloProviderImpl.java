package com.edaoren.service;

import com.edaoren.api.HelloProvider;
import com.edaoren.api.version.ServiceVersionConstants;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service("helloProvider")
@Service(timeout = 5000, version = ServiceVersionConstants.VERSION)
public class HelloProviderImpl implements HelloProvider {

    @Value("${spring.profiles.active}")
    private String env;

    @Override
    public String hello(String name) {
        return "hello11, " + name;
    }

    @Override
    public List<Map<String, String>> testMapList(Map<String, String> map) {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        list.add(map);
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("env", env);
        map2.put("testKey", "testValue");
        list.add(map2);
        return list;
    }
}
