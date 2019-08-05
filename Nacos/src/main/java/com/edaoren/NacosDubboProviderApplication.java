package com.edaoren;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.edaoren")
public class NacosDubboProviderApplication {

    /**
     * 日志.
     */
    private final static Logger log = LoggerFactory.getLogger(NacosDubboProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(NacosDubboProviderApplication.class, args);
    }

}

