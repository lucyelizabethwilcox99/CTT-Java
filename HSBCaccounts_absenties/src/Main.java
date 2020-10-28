
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accounts salesdepartment=new Accounts();
		Accounts itdepartment=new Accounts();
		
		try {
		salesdepartment.SalarySlip("Shafeeq", 1000, 12);
		}
		catch(AbsentiesException E) {
			System.out.println("send report");
		}
		
		try {
		itdepartment.SalarySlip("Ali", 5000, 2);
		}
		catch(AbsentiesException E) {
			System.out.println("its fine");
		}
		
	
	}
}
