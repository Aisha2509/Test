package newSintax.com;
import java.util.Scanner;
public class Ne {
	public static void main(String[]args) {
		System.out.println("Please enter your favorite car make");
		Scanner scan=new Scanner(System.in);
		  String car=scan.nextLine();
		  switch (car){
		    case "BMW" :
		      System.out.println("german car");
		      break;
		       case  "Toyota" :
		      System.out.println(" japanese car");
		      break;
		       case  "Maserati" :
		      System.out.println("italian car");
		      break;
		         default:
		  
		System.out.println("Your favorite car is unknow "); 
		  
		  
		  }
}
}