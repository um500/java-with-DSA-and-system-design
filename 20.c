#include<stdio.h>

int main()
{
    int number;
    printf("enter a number.");
    scanf("%d",&number);
    switch(number)
    {
    case 10:
    printf("number is equal to 10");
    break;
    case 50:
    printf("number is equal to 50");
    break;
    default:
     printf("number is not equal to 10 or 50");
    }
}