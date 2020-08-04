package cn.jiyun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//声明当前的应用是一个<---
public class JiyunEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiyunEurekaApplication.class, args);

   }

}
