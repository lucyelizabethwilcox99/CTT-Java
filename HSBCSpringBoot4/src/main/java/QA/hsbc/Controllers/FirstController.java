package QA.hsbc.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import QA.hsbc.Entities.College;
import QA.hsbc.Repo.CollegeRepo;

@RestController
public class FirstController {
	
	@Autowired
	CollegeRepo repo;
	
	@GetMapping("/saveRecord")
	public String saveRecord() {
		
		College student=new College();
		
		student.setRegno(19);
		student.setName("john");
		student.setMarks(100);
		
		repo.save(student);
		return "records saved";
		
	}

}
