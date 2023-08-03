package com.unejsi.springbootcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "From Cricket Coach!";
    }

}