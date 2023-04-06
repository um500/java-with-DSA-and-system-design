#include<stdio.h>

int main ()

{
   int choice,a,b,s;

   while (1)
   {
   

   printf("\n, addition");
   printf("\n, odd-even");
   printf("\n, printing n number");
   printf("\n,exit");
   
   printf("\n\nenter your choice");
   scanf("%d",&choice);
   switch (choice)
   {
   case 1:
     printf("enter two numbers");
     scanf("%d%d",&a,&b);
     s=a+b;
     printf("\nsum is %d",s);
     break;
   case 2:
     printf("enter a number");
     scanf("%d",&a);
     if (a%2==0)
     {
       printf("even number");
     }
     else
     {
        printf("odd number");
     }
   case 3:
     printf("enter a number");
     scanf("%d",&a);
     for ( b = 1; b <=a; b++)
     {
        printf("%d",b);
     }
     break;
   case 4:
     exit(0);

     default:
     printf("invalid");

    break;
   }
   return 0;
   }
}