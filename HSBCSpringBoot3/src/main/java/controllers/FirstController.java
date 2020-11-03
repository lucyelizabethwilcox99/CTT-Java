package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Repo.CollegeRepo;

@RestController
public class FirstController {

	@Autowired
	CollegeRepo repoRef;
	
	@GetMapping("/saverecord1")
	public String savingrecord1() {
		
		College.student =new 
				
				student.setRegno(1);
				student.setRegno(2);
				student.setRegno(3);
				
		repoRef.save		
	}
}
	
	
}
