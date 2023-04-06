package conditionalStatement;

import java.util.Scanner;

public class else_if {
	public static void main(String[] args) {
	/*	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your income-");
		int income = sc.nextInt();
		if(income<500000) {
			System.out.println(" 0% tax");
		}else if((income>=500000) && (income<1000000)) {
			int tax = (int) (income*(0.2));
			System.out.println("20% tax="+tax);
		} else {
			int tax = (int) (income * (0.3));
			System.out.println("30% tax = "+tax);
		}
		

		Scanner sc = new Scanner(System.in);
		System.out.print("enter your 1st number-");
		int a = sc.nextInt();
		
		System.out.print("enter your 1st number-");
		int b = sc.nextInt();
		
		System.out.print("enter your 1st number-");
		int c = sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("a is greater");
		}else if(b>=c) {
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
		}
		

		
		int number = 5;
		String type = (number%2==0) ? "even" : "odd";
		System.out.println(type);
		
	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your marks-");
		int marks = sc.nextInt();
		String type = (marks>33) ? "pass" : "fail";
		System.out.println(type);
	}

}
