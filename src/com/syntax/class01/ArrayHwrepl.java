package com.syntax.class01;

import java.util.Scanner;

public class ArrayHwrepl {

	public static void main(String[] args) {
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			//prints array
	  for(int i=0;i<a.length;i++){
		  for (int j=0;j<a[i].length;j++) {
	    System.out.print(a[i][j]); 
	  }System.out.println();
	    
	  }
	  System.out.println("***********************");
	  Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[nums.length - 1 - i]);}
		
	}

}
