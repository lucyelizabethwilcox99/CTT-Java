package QA.hsbc.Utilities;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Records {

	ArrayList<String> employees=new ArrayList<String>();
	
	public Records() {
		employees.add("lucy");
		employees.add("shafeeq");
		employees.add("tony");
	}
	public ArrayList<String> showEmployees() {
		return employees;
	
	}
	public void addrecord(String name) {
		employees.add(name);
		
	}
	
	public void removerecord(int rmo) {
		employees.remove(rmo);
	}
}
