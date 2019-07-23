package com.test.jenkinss;

import com.test.jenkinss.t1.MyTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JenkinssApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JenkinssApplication.class, args);
        MyTest myTest = context.getBean("myTest", MyTest.class);
        System.out.println(myTest.getStr());
    }

}
