package QA.hsbc.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.hsbc.Utilities.Records;

@RestController
public class First {

	@Autowired
	Records ref;

	@GetMapping("/showrecords")
	public ArrayList<String> displayallrecords() {
		return ref.showEmployees();
		
	}
	
	@GetMapping("/addrecord/{name}")
	public String addingrecord(@PathVariable("name") String n) {
		ref.addrecord(n);
		return "Record Saved";
		
	}
	@GetMapping("/removerecord/{r}")
	public String addingrecord(@PathVariable("r") int rmo) {
		ref.removerecord(rmo);
		return "Record Removed";
		
	}
	
}
