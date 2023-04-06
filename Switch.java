package conditionalStatement;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
/*	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("1.samosa ");
		System.out.println("2.burger ");
		System.out.println("3.mango sheck ");
		System.out.println("press your choice ");
		int number = sc.nextInt();
		switch(number){
		case 1: System.out.println("samosa");
		      break;
		case 2: System.out.println("burger");
		      break;
		case 3: System.out.println("mango shake");
		      break;
		default : System.out.println("invalid number");
	
	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of 1st number");
		int a = sc.nextInt();
		System.out.println("enter the value of 2nd number");
		int b= sc.nextInt();
		System.out.println("if add then press '+' ");
		System.out.println("if subtract then press '-' ");
		System.out.println("if multiply than press '*'");
		System.out.println("if divide then press '/'");
		System.out.println("if modulo then press '%'");
		System.out.println("press your choice ");
		char operator = sc.next().charAt(0); 
		switch(operator){
		case '+':
			   int add =a+b;
			System.out.println("addition is- "+add);
		      break;
		case '-':
			 int sub = a-b;
			System.out.println("subtraction is- "+sub);
		      break;
		case '*':
			 int mul = a*b;
			System.out.println("multiply is- "+mul);
		      break;
		case '/':
			int div = a/b;
			System.out.println("divide is- "+div);
			break;
			
		case '%':
			int mod = a%b;
			System.out.println("module is- "+mod);
			break;
		default : System.out.println("invalid number");
		
		}
	}

}
