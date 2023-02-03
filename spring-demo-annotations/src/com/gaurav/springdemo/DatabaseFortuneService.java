package com.gaurav.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "DatabaseFortuneService : Today is your lucky day!";
	}

}
