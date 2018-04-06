/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author w18154
 */
@Component
public class RugbyCoach implements Coach{
//    @Autowired
    public RugbyCoach(){
        
    }

    @Override
    public String getDailyWorkout() {
        return "Throw the ball at the end of the world !";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
    
}
