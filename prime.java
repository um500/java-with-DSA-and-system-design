package flowchart;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		//System.out.println("enter n number ");
		// Scanner sc = new Scanner(System.in); {
	          int n= 1;
			 int div = 2;
			  while(div<n) 
				  if(n%div==0)
					  System.out.println("not prime");
				  else 
					  div = div+1;
					  System.out.println("prime"); 
			  
		 }
//	}

}