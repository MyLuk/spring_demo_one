package org.myluk.pojo;

public class CricketCoach implements Coach {

    private String email, team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public void setEmail(String email) {
        System.out.println("In CricketCoach setmethod email");
        this.email = email;
    }

    public void setTeam(String team) {
        System.out.println("In CricketCoach setmethod team");
        this.team = team;
    }

    FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("In CricketCoach setmethod fortuneSercive");
        this.fortuneService = fortuneService;
    }

    public CricketCoach() {
        System.out.println("CricketCoach constructor");
    }

    public String getDailyWorkout() {
        return "hit the ball with a but";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
