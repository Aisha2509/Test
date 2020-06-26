package com.syntax.class01;
import java.util.Scanner;

public class HW {
public static void main (String[]args) {

		Scanner scan=new Scanner(System.in);
	System.out.println("Please enter first number");
	int num1=scan.nextInt();
	char Operator=scan.next().charAt(0);
	System.out.println("Please enter operator");
	int num2=scan.nextInt();
	int result;
	 switch (Operator) {
	 case '+':
		 result=num1+num2;
		 System.out.println(num1 + "+" + num2 + "=" + result);
		 break;
	 case'-':
		 result=num1-num2;
		 System.out.println(num1 +"-" + num2 +"=" + result);
		 break;
	 case'*':	 
		 result=num1*num2;
		 System.out.println(num1+"*"+num2+"="+ result);
		 break;
	 case'/':
		 result=num1/num2;
		 System.out.println(num1+"/"+num2+"="+ result);
		 break;
		 default:
		 System.out.println("Invalid");
		 
		 
	 }
	 }
}
	


