package com.syntax.class01;

public class Hw3fibunachi {

	public static void main(String[] args) {
		int[]numbers= {32,61,16,89,74,25};
		int max=numbers[0];
		int min=numbers[0];
		for (int num :numbers) {
		if (num > max) {
			max=num;
		}	
		else if (num<min) {
			min=num;
		}	
		}
         System.out.println("Maximum is :"+ max);
         System.out.println("Minimum is :"+ min);
         
	}

}
