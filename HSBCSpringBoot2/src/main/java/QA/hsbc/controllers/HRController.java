package QA.hsbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HRController {

	@GetMapping("/HSBC/hr")
	public String abourUs() {
		return "HR department of HSBC";
	}
	
}
