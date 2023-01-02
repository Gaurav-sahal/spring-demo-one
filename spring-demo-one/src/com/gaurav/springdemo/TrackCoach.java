package com.gaurav.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		System.out.println("TrackCoach: inside no-args constructor");
	}
	
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("TrackCoach: inside constructor injection");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TrackCoach: Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach: Just Do It: " + fortuneService.getFortune();
	}
	
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanStuffYoYo");
	}

}
