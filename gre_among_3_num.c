#include<stdio.h>

int main()
{
   int a,b,c;
   printf("enter three number");
   scanf("%d %d %d",&a,&b,&c);
   if(a>b && a>c)
   {
    printf("%d is greater number",a);
   } 
   else if(b>a && b>c)
   {
    printf("%d is greater number",b);
   }
   else{
    printf("%d is greater number ",c);
   }
   return 0;
}