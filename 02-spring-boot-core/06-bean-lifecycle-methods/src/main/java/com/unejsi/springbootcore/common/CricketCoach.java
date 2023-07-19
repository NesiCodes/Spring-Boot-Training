package com.unejsi.springbootcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    //define our innit method
    @PostConstruct
    public void doSmthInStartup(){
        System.out.println("In doSmthInStartup() method, class: " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doSmthInCleanup(){
        System.out.println("In doSmthInCleanup() method,  class: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "From Cricket Coach!";
    }

}
