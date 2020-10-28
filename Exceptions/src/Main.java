
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1,num2;
		float result;
		
		num1="tree";
		num2="0";
		
		try {
			result= Integer.parseInt(num1) / Integer.parseInt(num2);
			System.out.println("result is " + result);
		}
		
		catch(NumberFormatException ref1) {
			System.out.println(" only digits can be used in operations");
		}
		catch(ArithmeticException ref2) {
			System.out.println("cant divide by 0");
		}
		catch(Exception ref) {
			System.out.println("something went wrong");
		}
		
	}

}
