package org.myluk.pojo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

//    init method
    public void doMyStartupStuff() {
        System.out.println("Init startUpStuff");
    }

//    destroy
    public void doMyCleanupStuff() {
        System.out.println("Init CleanUpStuff");
    }


}
