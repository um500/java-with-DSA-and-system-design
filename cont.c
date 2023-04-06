#include<stdio.h>

int main()
{
    //##############<<print 1 to 10 and skip 3,7>>########3####
//   for(int i=1;i<=10;i++)
//   {
//     if(i==3){
//         continue;
//     }
//      else if(i==7){
//          continue;
//      }
//     printf("%d\n",i);
//   } 
//************(print 1 to 10 and skip 6)*************
// for(int i=1;i<=10;i++)
//   {
//     if(i==6){
//         continue;
//     }
//     printf("%d\n",i);
//  } 
//&&&&&&&&&&&& odd number from 5 to 50 &&&&&&&&&&&&&&&
//  for(int i=5;i<=50;i++)
//  {
//      if(i%2 != 0){
//       printf("%d\n",i);
//      }
//  }
 //@@@@@@@@@@@@@@  fact no.  ####################
// int n, fact=1;
// printf("enter a number:");
// scanf("%d",&n);
//  for(int i=1;i<=n;i++)
//  {
//    fact=fact*i;
//  }  
//     printf("the fcat is %d\n",fact);
   
  // %%%%%%%%%%%%%%%%%% reverse table %%%%%%%%%%%%%%%%%
//   int n;
//   printf("enter any number");
//   scanf("%d",&n);
//   for(int i=10;i>=1;i--)
//     {
//        printf("the table is %d\n",n*i);
//     }
 //&&&&&&&&&&&&&&& sum of 5 and 50 &&&&&&&&&&&&&&&&&&&&
 
     int sum=0;
     for(int i=5;i<=50;i++)
     {
        sum=sum+i;
     }
     printf("sum is %d",sum);
  return 0;
}