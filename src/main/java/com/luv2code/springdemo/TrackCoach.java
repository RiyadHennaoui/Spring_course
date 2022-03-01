package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;


    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method

    public void initBean(){
        System.out.println("Trackcoach: inside method initBean");
    }

    // add a destroy method
    public void destroyBean(){

        System.out.println("Trackcoach: inside method destroyBean");
    }
}
