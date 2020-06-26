package com.syntax.class01;

public class Array4 {

	public static void main(String[] args) {

		int[]numbers= {23,56,73,16,80,70,39};
		int largest= numbers [0];
		for(int num:numbers) {
			if (num>largest) {
				largest=num;
				System.out.println(largest);
			}
		}

	}

}
