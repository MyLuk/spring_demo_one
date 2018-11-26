package org.myluk.pojo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Throw the baseball ball";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
