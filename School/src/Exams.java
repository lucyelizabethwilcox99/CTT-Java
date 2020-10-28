
public class Exams {
	private int phy,che,total;
	private float per;
	String studentname;
	
	public void physics(int a) {
		if (a>=0 && a<=100) {
			phy=a; 	
		}
		else
		{
			System.out.println("Invalid Physics Marks");
		}
	}
	public void chemistry(int a) {
		if (a>=0 && a<=100) {
			che=a; 
		}
		else
		{
			System.out.println("Invalid Chemistry Marks");
		}
	}
	
	public void average() {
		int mean;
		mean=(phy+che)/2;
		System.out.println("The average is " + mean);
		
				
	}
	
	
	public void showResults() {
		total=phy+che;
		per=(float)total*100/300;
		System.out.println("Total marks:" + total);
		System.out.println("Percentage:" + per);
	}
}
