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


    @Override
    public String getDailyWorkout() {
        return "From Cricket Coach!";
    }

}
