/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 *
 * @author w18154
 */
@Component
public class DatabaseFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "This is database fortune service";
    }
    
}
