#include<stdio.h>

int main()
{
    int x,y;
    printf("enter your number:");
    scanf("%d %d",&x,&y);
//selective assignment
   printf("greater number is %d",x>y ?x :y);
    return 0;
    
}