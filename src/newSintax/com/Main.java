package newSintax.com;

import java.util.Scanner;

class Main {
	  public static void main(String[]args) {
	  Scanner scan=new Scanner(System.in);
	  
	  System.out.println("Do you need a loan? ");
	  boolean loan = scan.nextBoolean();
	   if(loan==true){
	     System.out.println("What is your credit score?");
	     int score=scan.nextInt();
	    if (score<=600){
	      System.out.println("The eligibility is Not eligible ");
	    } else if(score>=600 && score<=700){
	      System.out.println("The elegibility is Maybe elegible");
	    }else if (score>=701 && score<=700){
	      System.out.println("The eligibility is Eligible ");
	    }else {
	      System.out.println("The ekigibility is Definitely eligible");
	    }
	   }else {
	     System.out.println("The eligibility is Unknown");
	   }
	        
	      
	   
	  }

	
	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


