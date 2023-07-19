package com.unejsi.springbootcore.rest;

import com.unejsi.springbootcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach){
        System.out.println("Constructor: " + getClass().getSimpleName());
        this.myCoach=theCoach;
        this.anotherCoach=theAnotherCoach;
    }

    @GetMapping("/check")
    public String checkIfEqual(){
        return "Comparing beans myCoach and anotherCoach if they are the same: " + (myCoach==anotherCoach);
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
