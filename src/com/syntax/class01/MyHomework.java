package com.syntax.class01;

import java.util.Scanner;

public class MyHomework {
	public static void main(String[] args) {
		System.out.println("enter the roll number of the Child");
		Scanner scan = new Scanner(System.in);
		int student = scan.nextInt();
		switch (student) {
		case 101:
			System.out.println("Student name: Ramesh");
			break;
		case 102:
			System.out.println("Student name: Mahesh");
			break;
		case 103:
			System.out.println("Student name: Mukesh");
			break;
		default:
			System.out.println("Not found Student name: in Class");
		}
	}

}
