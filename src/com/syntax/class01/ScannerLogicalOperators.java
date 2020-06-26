package com.syntax.class01;

import java.util.Scanner;

public class ScannerLogicalOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Tell me your age please");
		int age = scan.nextInt();
		if (age >= 0 && age <= 3) {
			System.out.println("you are baby");
		} else if (age >= 4 && age <= 5) {
			System.out.println("you are childe");
		} else if (age >= 20 && age <= 64) {
		System.out.println("Enjoy life");
		} else
		{
			System.out.println ("I am good");
			
		}
			
		}
		}
	
	
	
	

