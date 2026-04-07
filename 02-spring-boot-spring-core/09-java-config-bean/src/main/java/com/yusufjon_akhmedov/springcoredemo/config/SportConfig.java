package com.yusufjon_akhmedov.springcoredemo.config;

import com.yusufjon_akhmedov.springcoredemo.common.Coach;
import com.yusufjon_akhmedov.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
