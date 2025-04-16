package com.liemartt.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableJpaRepositories
@EnableRedisHttpSession
public class CloudFileStorageApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CloudFileStorageApplication.class, args);
    }
}
