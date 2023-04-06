package loop;

import java.util.Scanner;

public class pr_loop {
	
	public static void main(String[] args) {
	/*	
		Scanner sc = new Scanner(System.in);
		int number;
		int choice;
		int evenSum = 0;
		int oddSum = 0;
		do {
		System.out.print("Enter the number ");
		number = sc.nextInt();
		if( number % 2 == 0) {
		evenSum += number;
		} else {
		oddSum += number;
		}
		System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
		choice = sc.nextInt();
		} while(choice==1);
		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("Sum of odd numbers: " + oddSum);

		
		Scanner sc = new Scanner(System.in);
		
		int fact = 1;
		
		System.out.println("enter any integer-");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("factorial:" +fact);
		
	*/
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number-");
		int n = sc.nextInt();
		for(int i =1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
