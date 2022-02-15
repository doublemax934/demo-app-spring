package ru.learnup.spring.demospringapp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.learnup.spring.demospringapp.services.*;

@Configuration
public class MyConfig {

    @Bean
    public OnlineSalesRegister onlineSalesRegister(){
        System.out.println("onlineSalesRegister is started");
        return new OnlineSalesRegister("Театральная касса");
    }
}
