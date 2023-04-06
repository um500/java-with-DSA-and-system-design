#include<stdio.h>

int main ()

{
    printf("%d",user());
    printf("\n%d",user());
    return 0;
}
int user()
{
    static int count=0;
    count++;
    return count;
}