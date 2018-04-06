/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author grzegorzjuszkiewicz
 */
@Configuration
@ComponentScan("com.luv2code.springdemo")
public class SportConfig {
    
    @Bean
    public FortuneService sadFortune(){
        return new SadFortuneService();
    }
    
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortune());
    }
    
    
    
    
}
