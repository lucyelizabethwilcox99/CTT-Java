package QA.hsbc.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import example.Student;
import example.StudentRecords;

@RestController
public class StudentController {
	
	@Autowired
	StudentRecords sturef;
	
	@GetMapping("/showallstudents")
	public ArrayList<Student> showStudents() {
		return sturef.showStudents();
	}
	
	@GetMapping("/getstudent/{name}")
	public ArrayList<Student> getStudent(int regno){
		ref getStudent=new getStudent();
		return Student;
		
	}
	
	@GetMapping("/saverecord/{regno}/{name}/{marks}")
	public String saverecord (@PathVariable("regno") int regno1,
							@PathVariable("name") String name1,
							@PathVariable("marks") int marks) {
	
		Student ref=new Student();
		ref.regno= regno1;
		ref.name= name1;
		ref.marks= marks;
		
		sturef.addrecord(ref);
		return "Record Saved";
	}
}
