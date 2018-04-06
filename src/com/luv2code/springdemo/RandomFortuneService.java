/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

/**
 *
 * @author w18154
 */
@Component
public class RandomFortuneService implements FortuneService{
    
    private String[] fortuneArray={"Lucky Day :-D","Regular Day :-|","Bad Day :-("};

    public String[] getFortuneArray() {
        return fortuneArray;
    }

    public int genRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(getFortuneArray().length);
    }
    

    @Override
    public String getFortune() {
        return getFortuneArray()[genRandomNumber()];
    }
    
}
