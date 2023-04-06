package loop;

import java.util.Scanner;

public class Do_While_Loop {

	public static void main(String[] args) {
/*		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter tour number-");
			int n= sc.nextInt();
			if(n%10 == 0) {
				break;
			}
			System.out.println(n);
		}while(true);
		
	
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter tour number-");
			int n= sc.nextInt();
			if(n%10 == 0) {
				continue;
			}
			System.out.println(n);
		}while(true);	
		
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number-");
		int n = sc.nextInt();
		
		if(n == 2) {
			System.out.println("n is prime");
		}else {
			boolean isPrime = true;
			for(int i=2;i<=n-1;i++) {
				if(n % i == 0) {
					isPrime = false;
				}
			}
			if(isPrime == true) {
				System.out.println("n is prime");
			}else {
				System.out.println("not prime");
			}

		}
		
	}

}
