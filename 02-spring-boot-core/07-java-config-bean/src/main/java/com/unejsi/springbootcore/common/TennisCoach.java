package com.unejsi.springbootcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "From Tennis Coach";
    }
}
