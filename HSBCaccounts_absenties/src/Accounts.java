
public class Accounts {

	public void SalarySlip(String name, int salary, int absenties) throws AbsentiesException {
		float tax, netsalary;
		if(absenties>10) {
			
		AbsentiesException ref=new AbsentiesException();
		throw ref;
		
		} 
		else {
		tax=(float) salary*23/100;
		netsalary=salary-tax;
		System.out.println("employee name: "+name);
		System.out.println("salary is " +salary);
		System.out.println("tax is : "+ tax);
		System.out.println("net salary is : "+ netsalary);
		
	}
	
		}
	
	}

