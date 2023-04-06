#include<stdio.h>

int main()
{
    int x;
    printf("enter your number:");
    scanf("%d",&x);
    if(x>0)
    {
        printf("pos. number");
    }
    if (x<0)
    {
        printf("neg. number");
    }
    return 0;
    

}