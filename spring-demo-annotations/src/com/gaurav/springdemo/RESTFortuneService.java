package com.gaurav.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RESTFortuneService : Today is your lucky day!";
	}

}
