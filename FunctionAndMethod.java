package function;

import java.util.*;

public class FunctionAndMethod {
	
	// function  yaa phir method
	
	public static void printHelloWorld() {
		for(int i=0;i<6;i++) {
		System.out.println("umesh verma");
		}
		return;
   }
	
	public static int calculateSum(int num1, int num2) {
		
		int sum = num1+num2;
		
		return sum;
	}
	
	
  	public static int calculateMul(int a, int b) {
		int mul = a*b;
		return mul;
		
	}

	public static int FindFactorial(int n) {
		int f= 1;
		
		for(int i = 1;i<=n;i++) {
			f=f*i;
		}
		
		return f;
	}
   
	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}

	
	public static int sum1(int a, int b) {
		return a+b;
	}
	public static float sum1(float a, float b) {
		return a+b;
	}
	
	
	public static boolean isPrime(int n) {
		for(int i=2;i<=n-1;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return false;
	}

	public static void PrimeInRange(int n) {
		for(int i =2;i<=n;i++) {
			if( isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void dectobin(int n) {
		int myNum = n;
		int pow = 0;
		int binNum = 0;
		
		while(n>0) {
			int rem = n % 2;
			binNum =  binNum + (rem * (int)Math.pow(10, pow));
			pow++;
			n = n/2;
		}
		System.out.println("binary form of "+ myNum+" = "+binNum);
	}

	
	public static void binToDec(int binNum) {
		int myNum = binNum;
		int pow= 0;
		int decNum = 0;
		
		while(binNum > 0) {
			
			int lastDigit = binNum%10;
			decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
			
			pow++;
			binNum = binNum/10;
		}
		System.out.println("decimal of " + myNum +" = " +decNum);
	}

	
	
	
	public static void main(String[] args) {
		
//		printHelloWorld();        // function call
		
//		Scanner sc= new Scanner(System.in); 
//		int a = sc.nextInt();
//		int b= sc.nextInt();
//		int sum = calculateSum(a,b);
//		System.out.println("sum is- "+sum);
	
	//	int mul = calculateMul(3,5);
	//	System.out.println("mul is- "+mul);
	// 
		
	//	System.out.println(FindFactorial(5));
	
 	//	System.out.println(sum1(3,4));
 	//	System.out.println(sum1(5.5f,5.2f));
 		
	//	System.out.println(isPrime(2));
		
	//	PrimeInRange(20);
		
		dectobin(7);
		
	//	binToDec(101);
	}


	
}
