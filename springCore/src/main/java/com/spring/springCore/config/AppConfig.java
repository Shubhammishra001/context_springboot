package com.spring.springCore.config;

import com.spring.springCore.service.Pizza;
import com.spring.springCore.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig implements Pizza {
    @Bean
    public Pizza vegPizza(){
        return new VegPizza();//explacit b

    }

    @Override
    public String getPizza() {
        return null;
    }
}
