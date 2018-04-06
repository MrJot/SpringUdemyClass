/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author grzegorzjuszkiewicz
 */
public class AnnotationScopeDemo {
    
    public static void main(String[] args) {
        
        //load spring config file
        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = contex.getBean("tennisCoach",Coach.class);
        Coach alphaCoach= contex.getBean("tennisCoach", Coach.class);
        boolean result= (theCoach==alphaCoach);
        
        System.out.println("Pointing to the same objext "+result);
        System.out.println("The Coach "+theCoach);
        System.out.println("Alpha Coach "+alphaCoach);
        contex.close();
        
        ///
        
        
    }
    
}
