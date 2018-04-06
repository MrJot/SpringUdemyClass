/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

import java.util.Random;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author grzegorzjuszkiewicz
 */
public class SwimCoach implements Coach{
    
    private FortuneService fortuneService;
    
    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
//    good.fortune=It will be your lucky day ! ;-D
//bad.fortune = It will be you bad day ! :-(
//regular.fortune = It will be regular day
//random.fortune = Nobody knows what is going to happen !
//}
    
//    @Value("${good.fortune}")
//    private String goodFortune;
//    @Value("${bad.fortune}")
//    private String badFortune;
//    @Value("${regular.fortune}")
//    private String regularFortune;
//    @Value("${random.fortune}")
//    private String randomFortune;
//    
//   private  String[] fortuneArray=new String[4];
//    
//    
//    @PostConstruct
//    public void setupData(){
//        this.fortuneArray[0]=this.goodFortune;
//        this.fortuneArray[1]=this.badFortune;
//        this.fortuneArray[2]=this.regularFortune;
//        this.fortuneArray[3]=this.randomFortune;
//    }
//    
//    
//    public SwimCoach(){
//        System.out.println("Hello there ! I am inside Swim Coach Construxtor");
//}
//    
//    
//    public int fortuneLenght(){
//        return this.fortuneArray.length;
//    }
    
    

    @Override
    public String getDailyWorkout() {
        return "You must swim for at least 10 km per day";
    }

    @Override
    public String getDailyFortune() {
//        Random rand = new Random();
        return fortuneService.getFortune();        
    }
    
}
