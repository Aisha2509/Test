package com.syntax.class01;
import java.util.Scanner;
public class NestedLoops {

	public static void main(String[] args) {

	for(int h=0;h<24;h++) {
	
	for(int m=0;m<60; m++) {
		if (m<10) {
			System.out.println(h+":0"+m);
		}else 
		System.out.println(h + ": " + m);
	}
}

	System.out.println("**************************************");
	for (int i=1;i<=5;i++) {
		for (int j=1;j<=i;j++) {
			System.out.print(i);
			
		}
		System.out.println();
}
System.out.println("--------------------------------------");
Scanner scan=new Scanner(System.in);
System.out.print("How many floore  in hotel");
	int floors =scan.nextInt();
	int rooms=scan.nextInt();
	for(int i=1;i<=floors;i++) {
		System.out.println("Flore"+ i);
		for (int j=1;j<=rooms;j++) {
		System.out.println(i + ". "+ " ");
		System.out.println();
		
	}

	}
	}

}
