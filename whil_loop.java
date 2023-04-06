package loop;

import java.util.Scanner;

public class whil_loop {
	public static void main(String[] args) {
		
	/*
		
		int i = 0;
		while(i<=100) {
			System.out.println("hello world");
			i++;
		}
		

		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter tour number-");
		int n = sc.nextInt();
		int counter = 1;
		while(counter<=n) {
			System.out.println(counter);
			counter++;
		}
		
		
*/
		Scanner sc = new Scanner(System.in);
		System.out.print("enter tour number-");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=n) {
		   sum = sum+i;
		   i++;
		}
		 System.out.print(sum);
		
		
	}

}
