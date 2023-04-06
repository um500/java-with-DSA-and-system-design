package dataType;

import java.util.Scanner;

public class javaBasics {
	public static void main(String[] args) {
		
	/*	
		System.out.println("1,2,3,4,5");
		System.out.println("1,2,3,4,5");
		System.out.println("1,2,3,4,5");
		System.out.println("1,2,3,4,5");
		
	
		
		int a =5;
		int b = 39;
		System.out.println(a);
		System.out.println(b);
		a=b;
		System.out.println(a);
		
		

		
	// data type
		byte b = 125;
		System.out.println(b);
		char ch ='a';
		System.out.println(ch);
		 boolean var = true;
		 float regt = 4.3F;
	
		
		int a = 10;
		int b= 45;
		int sum = a+b;
		System.out.println(" sum of a and b is-" +sum);
		

		System.out.println("enter name");
		Scanner sc = new Scanner(System.in);
		 String name = sc.nextLine();
	     System.out.println(name);	
	     
	     
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number-");
		int a = sc.nextInt();
		System.out.println("enter 2nd number-");
		int b=sc.nextInt();
		int sum = a+b;
		System.out.println("final value is -"+sum);
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius-");
		float r = sc.nextInt();
		float aoc = 3.14f*r*r;
		System.out.println(aoc);
		

		
      char a = 'a';
      char b = 'b';
       System.out.println((int)(b));
       System.out.println((int)(a));
        
       System.out.println(b-a);
       
        // agv of 3 sub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter phy marks-");
		int a = sc.nextInt();
		System.out.println("enter bio marks-");
		int b=sc.nextInt();
		System.out.println("enter chy marks-");
		int c=sc.nextInt();
		int avg = (a+b+c)/3;
		System.out.println("average of these three subject-"+avg);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side-");
		int side = sc.nextInt();
		int aos = (side*side);
		System.out.println("area of square-"+aos);


		// cost of three items
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("enter pencil price");
	    float pencil = sc.nextFloat();
	    
	    System.out.println("enter pen price");
	    float pen = sc.nextFloat();
	    
	    System.out.println("enter eraser price");
	    float eraser = sc.nextFloat();
	    
	    float total = pencil+pen+eraser;
	    System.out.println("total cost of the item-"+total);
	    
	    float newTotal = total + (0.18f * total);
	    System.out.println("18% gst with total-"+newTotal);

	
		// logical and
		System.out.println((3>2)&&(5>0));
		System.out.println((3>2)&&(5>8));
		System.out.println((3>5)&&(5>9));
		System.out.println((3>6)&&(5>4));
	
		
		System.out.println((3>2)||(5>0));
		System.out.println((3>2)||(5>8));
		System.out.println((3>5)||(5>3));
		System.out.println((3>6)||(5>7 ));

	
		System.out.println(!(5>9));
		System.out.println(!(5>4));	
*/
		int x = 9, y = 12;
		int a = 2, b = 4, c = 6;
		int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
		System.out.println(exp); 
	
	}

}
