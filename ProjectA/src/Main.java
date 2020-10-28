
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1, num2;
		num1=10;
		num2=2;
		
		try {
			
			int result= num1/num2;
			System.out.println("the result is " + result);
			System.out.println("hello");
			
		}
		
		catch(ArithmeticException ref1) {
			System.out.println("you cant divide by zero");
			
		
		}
		
	}
	

}
