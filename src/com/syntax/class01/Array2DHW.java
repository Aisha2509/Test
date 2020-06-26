package com.syntax.class01;

public class Array2DHW {

	public static void main(String[] args) {
	int [][] numbers={{25,8,32,88,},{50,82,79,36,},{52,85,74,55},};
	for (int []num:numbers) {
		for (int i:num) {
			System.out.print(i+" ");}}
	System.out.println();
	
	System.out.println("_________________________");
	//Regular array
	String[]country= {"Canada","Colombia","Spain","Nigeria"};
	for (int i=0; i<country.length; i++) {
		System.out.print(country[i]+" ");}
	System.out.println("");
	//2D Array	
		for (String coun:country) {
			System.out.print(coun+" ");}
		System.out.println();
		
	System.out.print("\n****************************");	
	System.out.println();
	String[]cars= {"Tesla","Audi","Kia","Ferary"};
	for (int i=0;i<cars.length;i++) {
		System.out.print(cars[i]+" ");
	}
		
		System.out.println();
		

	}

}
