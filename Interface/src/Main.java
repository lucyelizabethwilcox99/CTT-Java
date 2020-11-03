
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HSBC hsbc=new HSBC();
		Banking(hsbc);
		hsbc.welcome();
		
		
	}
	
	static public void Banking(BofE Bankingref) {
		Bankingref.openAcc();
		Bankingref.showBal();
	
		
	}

}
