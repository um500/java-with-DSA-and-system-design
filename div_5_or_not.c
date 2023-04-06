#include<stdio.h>

int main()
{
     int i;
   printf("enter a number:");
   scanf("%d",&i);
   if(i%5 == 0)
   {
    printf("divisible by 5");

   }else{
    printf("not div. by 5");
   }
}