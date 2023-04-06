#include<stdio.h>

int main()
{
    float  length,width,perimeter;
    printf("enter the length of rectangle");
    scanf("%f",&length);

    printf("enter the width of rectangle");
    scanf("%f",&width);

    perimeter=2*(length+width);

    printf("perimeter of rectangle is=%f",perimeter);
    return 0; 
}