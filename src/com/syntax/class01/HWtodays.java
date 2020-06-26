package com.syntax.class01;

public class HWtodays {

	public static void main(String[] args) {
	int a=20;
	int b=30;
	System.out.println("value a+b "+ a+" "+b);
	a+=b;
	b=a-b;
	a=-b;
	System.out.println("value a+b "+ a +" " + b);
	System.out.println("*****************");
	
	int number=10;
	boolean prime = true;
	if (number>1) {
		for(int i=2; i<number;i++) {
			if (number%i==0) {
				prime=false;
				break;
			}
		}
	}else {
		prime = false;
		
	}
	
	System.out.println("The number"+ number + prime);

	}

}
