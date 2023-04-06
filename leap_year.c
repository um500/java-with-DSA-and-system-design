#include<stdio.h>

int main()
{
   int a;
   printf("enter a number");
   scanf("%d",&a);
   if (a%4 )
   {
    printf(" not a leap year");
   }
   else if(a%100)
   {
    printf("not a leap year");
   }
   else if(a%400)
   {
    printf("not a leap year");
   }
   else{
    printf("leap year");
   }
   

   return 0;
}