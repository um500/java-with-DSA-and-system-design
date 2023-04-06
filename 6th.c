#include<stdio.h>

int main()
{
    int marks;
    printf("enter a marks:");
    scanf("%d",&marks);
    if(marks>60)
    {
        printf("congurate you scored grade A:");
    }
    else if(marks>40 && marks<60)
    {
        printf("you scored grade B");
    }
    else if(marks>33 && marks<40)
    {
        printf("you scored grade C");
    }
    else
    {
        printf("yor are fail");
    }
    return 0;
}