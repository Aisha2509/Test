package com.syntax.class01;
import java.util.Scanner;
public class work {
	
	public static void main (String[]arg) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		String user=scan.nextLine();
		String grade;
		switch(user) {
		case "A":
			grade="Excellent";
			break;
		case "B":
			grade="Good";
			break;
		case "C":
			grade="Average";
			break;
		case "D":
			grade="Bad";
			break;
			default:
				grade="Zero";
				System.out.print(user+","+"was entered by user with explination of" + ".");
			
		
		
	}	
	}

	
	






}


