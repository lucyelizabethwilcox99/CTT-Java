package QA.hsbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {

	public String message() {
		return "sales department of HSBC";
	}
	
	@GetMapping("/hsbc/sales")
	public String aboutus() {
		return "sales department of HSBC";
	}
	
}
