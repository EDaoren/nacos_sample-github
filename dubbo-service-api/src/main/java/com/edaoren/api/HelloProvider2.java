package com.edaoren.api;

import java.util.List;
import java.util.Map;

public interface HelloProvider2 {

    String hello(String name);

    List<Map<String, String>> testMapList(Map<String, String> map);

}
