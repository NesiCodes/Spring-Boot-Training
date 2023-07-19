package com.unejsi.springbootcore.common;

import org.springframework.stereotype.Component;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "From Swim Coach";
    }
}
