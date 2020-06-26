package newSintax.com;

import java.util.Scanner;

public class NewClass {
	//	Write a Java program to ask age "Please enter your age". 
		//Based on the age define whether the user is eligible to vote or not.

		//A person who is eligible to vote must be older or equal to 18 years old and the program will show "You are eligible to vote".
	//	Otherwise, the program will show "You are not eligible to vote".

	//	Examples:
		//Please enter your age 18
	//	You are eligible to vote
	//	Please enter your age 16
	//	You are not eligible to vote

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Please enter your age ");
		int nam=scan. nextInt();
		int age = 18;
		if (age>=18&&(age <=16)) {
			System.out.println("You are eligible to vote");
		}
			System.out.print("Please enter your age");
		int nam1=scan. nextInt();
		
		
				System.out.println("You are not eligible to vote");
			}
			
		}
	


