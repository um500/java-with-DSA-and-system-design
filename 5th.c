#include<stdio.h>

int main()
{
    int number;
    printf("enter a number:");
    scanf("%d",&number);

    if(number%2==0)
    {
       printf("%d even number",number);
    }
    else
    {
        printf("%d odd number",number);
    }
    return 0;
}