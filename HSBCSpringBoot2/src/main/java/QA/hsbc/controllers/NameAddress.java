package QA.hsbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameAddress {

@GetMapping("/info/{name}/{address}")	
public String information (@PathVariable("name") String n,
							@PathVariable("address") String a) {
	

	return n + " lives in " + a;
}
}


