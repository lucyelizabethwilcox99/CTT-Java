
public class Exams {

	private int phy,che,total;
	private int maxphy,maxche;
	private float per;
	
	public Exams() {
		maxphy=100;
		maxche=100;
	}
	
	public Exams(int marks) {
		maxphy=marks;
		maxche=marks;
				
	}
	
	public void physics(int p) {
		
		if (p>=0 && p<=maxphy) {
			phy=p;
			System.out.println("well done physics results are " + p);
			
		}else {
			System.out.println("invalid physics marks");
		}
		}
	
	public void chemistry(int c) {
		if (c>=0 && c<=maxche) {
			che=c;
			System.out.println("well done chemistry result are " + c);
			
		}else {
			System.out.println("invalid chemistry marks");
		}
		}
	
	
	public void showResults() {
		total=phy+che;
		per=(float) total*100/(maxphy+maxche);
		System.out.println("total results: "+ total);
		System.out.println("percentage: "+ per);
	}
}
