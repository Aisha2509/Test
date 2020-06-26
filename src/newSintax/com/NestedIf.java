package newSintax.com;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean hasDiploma= true;
		boolean noDiplom=false;
		double gpa=3.92;
		if (hasDiploma) {
			System.out.println ("congratulation");
		} if (noDiplom) {
			System.out.println("stady");
		}
			System.out.println("get a degree");
			if (hasDiploma) System.out.println ("gpa score");
			if (gpa <=3.5) {
			System.out.println("You are eligebly fore schoolarship"); 
			}else {
				System.out.println("you shouls have student degree");
			}
			
	    System.out.println("**********************************");
	    
	}
}
		