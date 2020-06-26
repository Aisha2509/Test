package com.syntax.class01;

public class Arrey3 {

	public static void main(String[] args) {
	char[] grade= {'A','B','C','D','F'};
	for (int i =0; i<grade.length; i++) {
		System.out.print(grade [i]+ ",");
		}System.out.println();
	

	
	String[] fruits= {"Apple", "Orange", "Grapes" ,"Banana","Cumcumber"};
	for (int i=0; i<fruits.length; i++) {
		System.out.print(fruits [i]+ ",");
	}
	System.out.println();
	for (String f : fruits) {
		System.out.println(f);
	}
	String[]cars= {"Toyota","Honda","Chewy","BMW","Hunday","Mersedes"};
	for (int i=0;i<cars.length;i++) {
		System.out.println(cars[i]+",");
	}
	
	System.out.println("____________________________");
	String[]countries= {"Tajikistan","Turkey","Usa"};
	for (String country:countries) {

		if (country.equals("Tajikistan")) {
			System.out.println("Dushanbe my back country");
		}else if (country.equals("Turkey")) {
				System.out.println("Stambul");
		}	else if (country.equals("Usa")){
					System.out.println("New York");
		
			
		
		}
	}
	}
	
}