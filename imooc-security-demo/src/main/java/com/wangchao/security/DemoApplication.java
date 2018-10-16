package com.wangchao.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class DemoApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(DemoApplication.class,args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello securety";
    }
}
