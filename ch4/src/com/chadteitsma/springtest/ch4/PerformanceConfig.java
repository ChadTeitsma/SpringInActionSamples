package com.chadteitsma.springtest.ch4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan
public class PerformanceConfig {

    @Bean
    public Performance performance() {
        return new TakeTheL();
    }

    @Bean
    public Spectators spectators(){
        return new Spectators();
    }
}
