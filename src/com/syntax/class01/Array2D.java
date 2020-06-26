package com.syntax.class01;

public class Array2D {

	public static void main(String[] args) {
		int[][] numbers= {
				{10,23,56,47},
				{33,668,89,},
				{1,9,0} };
		int sum=0;
		for (int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length; j++) {
				int element=numbers[i][j];
				if (numbers[i][j]%2!=0) {
					sum+=numbers[i][j];
				}
				sum+=numbers[i][j];
			}
			
		}
		System.out.println(sum);

	}

}
