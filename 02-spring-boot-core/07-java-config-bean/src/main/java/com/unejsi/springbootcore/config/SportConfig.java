package com.unejsi.springbootcore.config;

import com.unejsi.springbootcore.common.Coach;
import com.unejsi.springbootcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig{

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
