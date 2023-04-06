#include<stdio.h>

int main()
{
    int age;
    printf("enter your age:");
    scanf("%d",&age);
    if(age<18)
    {
        printf("we can not drive the car:");
    }
    else 
    {
        printf("we can  drive the car:");
    }
return 0;
}