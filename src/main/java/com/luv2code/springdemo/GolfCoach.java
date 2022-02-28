package com.luv2code.springdemo;

public class GolfCoach implements Coach{

    private RandomFortuneService randomFortuneService;

    public GolfCoach(RandomFortuneService randomFortuneService) {
        this.randomFortuneService = randomFortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Practice your putting skills for 2 hours today";
    }

    @Override
    public String getDailyFortune() {
        return randomFortuneService.getFortune();
    }
}
