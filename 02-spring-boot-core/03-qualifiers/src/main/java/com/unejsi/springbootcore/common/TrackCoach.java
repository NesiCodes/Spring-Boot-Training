package com.unejsi.springbootcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "From TrackCoach";
    }
}
