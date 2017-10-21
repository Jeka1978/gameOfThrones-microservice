package com.gameOfThrones.core;

import com.gameOfThrones.sdk.services.UserSdkService;
import my.spring.infra.EnableMain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Evegeny on 21/12/2016.
 */
@Configuration
@ComponentScan(basePackages = "com.gameOfThrones.core")
@EnableMain
public class AppConfig {
    @Bean
    public UserSdkService myUserService(){
        return new UserSdkService();
    }
}
