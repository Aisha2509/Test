package newSintax.com;
import java.util.Scanner;
public class homeW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you thirsty?");
	    System.out.println("Are you sleepy?");
	    
	    boolean thirsty=scan.nextBoolean();
	    boolean sleepy=scan.nextBoolean();
	    if (thirsty==true && sleepy==false){
	      System.out.println("Looks like you need to drink Water");
	    }else if (thirsty==true && sleepy==true){
	      System.out.println("Looks like you need to drink Coffe");
	    }else if (thirsty==false&&sleepy==true){
	      System.out.println("Looks like you need to drink Tea");
	    }else{
	      System.out.println("Looks like you need to drink Nothing");
	    }
	    
		    
		    
		    
		    
		    
		    
		    
	}

	
	}


