///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.luv2code.springdemo;
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author w18154
// */
//@Component
////@Scope("prototype")
//public class TennisCoach implements Coach{
//    @Autowired
//    @Qualifier ("randomFortuneService")
//    private FortuneService fortuneService;
//    
//    
//@PostConstruct    
//public void doMyStartupStuff(){
//    System.out.println("To My Startupr");
//}
//    
////    @Autowired
////    public void setFortuneService(FortuneService fortuneService) {
////        System.out.println("Hello there, I am inside setter :-D");
////        this.fortuneService = fortuneService;
////    }
//    
////    @Autowired
////    public void doSomeStuff() {
////        System.out.println("This is crazy !!");
////    }
//    
//    
////    @Autowired
////    public TennisCoach(FortuneService fortuneService){
////        this.fortuneService=fortuneService;
////    }
////    @Autowired
//    public TennisCoach(){
//        System.out.println("I am inside TennisCoach constructor");
//    }
//    
//    
//    @Override
//    public String getDailyWorkout() {
//        return "Parcitce your backhans";
//    }
//
////   
//    public String getDailyFortune() {
//        return fortuneService.getFortune();
//    }
//    @PreDestroy
//    public void doMyCleanup(){
//            System.out.println("Mass destruction at tennis !");
//    }
//    
//}
