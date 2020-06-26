package newSintax.com;
public class Scanner{

	public static void main(String[] args) {
		Scanner scan=new Scanner();
		System.out.println("Pleaseenter 3 distinct numbers");
		int first =scan.nextInt();
		int second = scan.nextInt();
		int third =scan.nextInt();
		if (first> second) {
			if (first>third){
				System.out.println("The largest number is "+first);
			}else {
				System.out.println("The largest number is "+ third);
			}
		}else {
			if (second > third) {
				System.out.println("The largest number is "+ second);
			}else {
				System.out.println("The largest number is "+third);
				
			}
		}
		
		
		
		
		
		
		
		
	
	}

	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}


