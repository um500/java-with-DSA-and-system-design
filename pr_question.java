package function;

import java.util.*;
public class pr_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter 1st number- ");
//	    double a = sc.nextDouble();
//	    
//	    System.out.println("enter 2st number- ");
//	    double b  = sc.nextDouble();
//	    
//	    System.out.println("enter 3rd number- ");
//	    double c = sc.nextDouble();
//	    
//	    System.out.println("the avg value is "+avg(a,b,c)+"\n");
//	}
	
//	public static double avg(double a, double b,double c) {
//		return (a+b+c)/3;
//	}
		
		
		// pr 2
		
	//	Scanner sc = new Scanner(System.in);
	//	
	//	int num;
	//	System.out.println("enter an integer- ");
	 //   num = sc.nextInt();
	    
	  //  if(isEven(num)) {
	   // 	System.out.println("number is even- ");
	   // } else {
	    //	System.out.println("number is odd-");
	   // }
	 // }
	
//	public static boolean isEven(int number) {
//		if(number % 2 == 0) {
	//		return true;
//		}
//		else {
//			return false;
//		}
//	}
	
		
		// pr 3
		
//		System.out.println(" enter a number - ");
//		Scanner sc = new Scanner(System.in);
//		
//		int palindrome = sc.nextInt();
//		
//		if(ispalindrome(palindrome)) {
//			System.out.println("number :"+palindrome+"is a palindrome");
//		}else {
//			System.out.println("number :"+palindrome+"is  not a palindrome");
//		}
		
//	}
	
//	public static boolean ispalindrome(int number) {
//		int palindrome = number;
//		int reverse = 0;
		
//		while(palindrome != 0) {
//			int reminder = palindrome  % 10;
//			reverse = reverse * 10 +reminder;
//			palindrome = palindrome / 10;
//		}
//		// if orginal and the reverse of number is equal means
//		// number is a palindrome in java
		
//		if(number == reverse) {
//			return true;
//		}
		
//		return false;
		
//	}
		
		
		// pr 4
	
		
		//pr 5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number- ");
	    int digits  = sc.nextInt();
	    System.out.println(" the sum is "+ sumDigits(digits));
	    
	    
	}

	public static int sumDigits(int n) {
		// TODO Auto-generated method stub
		int sumOfDigits = 0;
		while(n > 0) {
			int lastDigit = n%10;
			sumOfDigits = sumOfDigits + lastDigit;
			n = n/10;
		}
		return sumOfDigits;
	}

}
