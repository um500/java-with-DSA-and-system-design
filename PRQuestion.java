package conditionalStatement;

import java.util.Scanner;

public class PRQuestion {

	public static void main(String[] args) {
/*		
         // pr.-01
          
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number- ");
		int number = sc.nextInt();
		
		if(number>0) {
			System.out.println("positive number");
		}else {
			System.out.println("negative number");
		}
	 
		// pr - 02
		
		double temp = 75;
		if(temp>100) {
			System.out.println("you have a feaver");
		}else {
			System.out.println("you don't have a fever");
		}
		
 
		//pr.-03
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter week number(1-7)- ");
		int number = sc.nextInt();
		switch(number) {
		
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("invalid number............");
		}
	*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the year: ");
		int year = sc.nextInt();
		boolean x = (year % 4) == 0;
		boolean y = (year % 100) != 0;
		boolean z = ((year % 100 == 0) && (year % 400 == 0));
		if (x && (y || z)) {
		System.out.println(year + " is a leap year");
		} else {
		System.out.println(year + " is not a leap year");
		}
		
	}

}
