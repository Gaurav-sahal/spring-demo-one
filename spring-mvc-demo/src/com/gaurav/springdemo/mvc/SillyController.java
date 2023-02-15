package com.gaurav.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SillyController {

	@RequestMapping("/showForm")
	@ResponseBody
	public String displayTheForm() {
		return "silly";
	}
}
