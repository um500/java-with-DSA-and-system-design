#include<stdio.h>

int main()
{
    int marks;
    printf("enter your marks:");
    scanf("%d",&marks);
    if(marks>=33)
    {
        printf("pass:");
    }
    else
    {
        printf("fail:");
    }
    return 0;
}