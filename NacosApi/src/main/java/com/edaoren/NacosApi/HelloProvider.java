package com.edaoren.NacosApi;

import java.util.List;
import java.util.Map;

public interface HelloProvider {

    String hello(String name);

    List<Map<String, String>> testMapList(Map<String, String> map);

}
