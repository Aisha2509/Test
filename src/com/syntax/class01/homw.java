package com.syntax.class01;

import java.util.Scanner;

public class homw {

	public static void main(String[] args) {
		
	Scanner scan= new Scanner (System.in);
	System.out.println("Tel me plese your mont month of birthday ");
	String month =scan.nextLine();
	if (month. equals ("Desember")||month.equals("January")||month.equals("February") ) {
		System.out.println ("Your month of birthday is in Summer");
	}else if (month.equals ("March")||month.equals("April")||month.equals("May")) {
		System.out.println("Your month of birth is in Spring");
		
	}else if (month.equals("Jun")||month.contentEquals("July")||month.equals("August")) {
		System.out.println("Your month of birth is in Sammer");
	}else if (month.equals("September")||month.equals("October")||month.contentEquals("November")) {
		System.out.println("Your mont of birth is in Fall");
		
	}
	
			
	
	
	
		

	}
}