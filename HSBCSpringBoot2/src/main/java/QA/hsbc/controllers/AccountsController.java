package QA.hsbc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.hsbc.Utilities.TaxCalculation;

@RestController
public class AccountsController {
	
	@Autowired
	TaxCalculation ref;

	@GetMapping("hsbc/TaxCalculation/{salary}")
	public String salarycalculation(@PathVariable("salary") int sal) {
		
		return "Your tax is: " + ref.tax(sal);

	//@GetMapping("/hsbc/accounts")
	//public String aboutus() {
		//return "Accounts department";
	}
	
	
}
