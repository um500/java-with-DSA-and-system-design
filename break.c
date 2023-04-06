#include<stdio.h>

int main()
{
    // for(int i=0;i<=5;i++){
    //     if(i==4){
    //         break;
    //     }
    //     printf("%d\n",i);
    // }
    // printf("end");
  //##################@@  ODD  @#####################
    // int n;
    // do{
    //     printf("enter any number");
    //     scanf("%d",&n);
    //     printf("%d\n", n);

    //     if(n%2 !=0)
    //     {
    //         break;
    //     }
    // }while(1);
    // printf("thank you");

    //*************************** MULTIPLE ***********

    int n;
    do{
        printf("enter any number");
        scanf("%d",&n);
        printf("%d\n", n);

        if(n%7 ==0)
        {
            break;
        }
    }while(1);
    printf("thank you");

    return 0;
}