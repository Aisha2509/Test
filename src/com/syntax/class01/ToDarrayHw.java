package com.syntax.class01;

public class ToDarrayHw {

	public static void main(String[] args) {
		String[][]nume = { 
				{"Kamila","Nargiza","Iroda","Dilnoza"},
				{"A","B","C","D"},
		};
		System.out.println("Student "+nume[0][0]+ " hase " +nume [1][0]+ " grade");
		System.out.println("Student "+nume[0][1]+ " hase " +nume [1][1]+ " grade");
	System.out.println("__________________________________");			
		
 String[][]in= {
		 {"Mr", "Mrs", "Ms", "Miss"},
		 { "Smith", "Jordan", "Jackson", "Obama"}, };
		System.out.println(in[0][1]+ " "+in[1][0]+ ",");
		System.out.println(in[0][0]+ " "+ in[1][3]+",");
		System.out.println(in[0][2]+ " " +in[1][2]+ ",");
		System.out.println(in[0][3]+ " "+in[1][1]+",");
		System.out.println("****************************");
		int[][]numbers= {
				{2,5,10,3},
				{12,7,9,8},
				{20,30,60,50},
		};
		int r=numbers.length;
		int c=numbers[0].length;
		System.out.print("Even numbers:");
		for (int i=0;i<r;i++) {
		for (int j=0;j<c;j++) {
		if (numbers[i][j] % 2 == 0) {
			System.out.println(numbers[i][j]+" ");
	}
}
		}
		System.out.println("********************************");
		
	 int[][]num= {
			 {5,8,3},
			 {10,4,6},
			 {7,2,9},
	 };
	 int sum =0;
		for (int str =0;str<num.length;str++) {
		for (int stl=0;stl<num[str].length;stl++) {
		sum+=num[str][stl];}}

System.out.println("The sum of all numbers is "+ sum);

}}