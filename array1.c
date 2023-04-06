#include<stdio.h>
#include<conio.h>

//int reverse(int arr[] , int n);

//int main()
//{
   // int a=10;
    //int b=20;

    // int marks[3];

    // printf("enter phy:");
    // scanf("%d",&marks[0]);

    // printf("enter che:");
    // scanf("%d",&marks[1]);

    // printf("enter math:");
    // scanf("%d",&marks[2]);

    // printf("phy = %d, che = %d, math =%d", marks[0],marks[1],marks[2]);
    

//@@@@@@@@@@@@@#############$$$$$$$$$$$$$$$$%%%%%%%%%%%%

//float item[3];
//printf("enter three item:");
//scanf("%f",&item[0]);
//scanf("%f",&item[1]);
//scanf("%f",&item[2]);
// printf("enter rice price:");
// scanf("%d",&item[0]);

// printf("enter book price:");
// scanf("%d",&item[1]);


// printf("enter copy price:");
// scanf("%d",&item[2]);


//printf("total item 1 : %f\n",item[0] + (0.18 * item[0] ));
//printf("total item 2: %f\n",item[1] + (0.18 * item[1] ));
//printf("total item 3 :%f\n",item[2] + (0.18 * item[2] ));


//printf(" rice = %d,book = %d,copy=%d",item[0],item[1],item[2]);

//@@@@@@@@@@@@@####################$$$$$$$$$$$$$%%%%%%%%%%%%%%^^^^^^^^^^^^

//   char star ='*';
//   char *ptr =&star;
//   printf(" pptr = %u\n", ptr);
//   ptr++;
//    printf(" pptr = %u\n", ptr);
//    ptr--;
//    printf(" pptr = %u\n", ptr);


  
   //@@@@@@@@@@@@@@@@@@!!!!!!!!!!!!!!@################

    // int age = 22;
    // int _age=23;
    // int *ptr = &age;
    // int *_ptr = &_age;

    // printf("%u , %u\ndifference = %u\n",ptr,_ptr,ptr-_ptr);
    // _ptr = &age;
    // printf("comparison = %u\n", ptr == _ptr);

    //&&&&&&&&&&&&&&&&********************((((((((((((()))))))))))))

   // int aadhar[5];

   // //input
   // int *ptr = &aadhar[0];
   // for(int i=0;i<5;i++){
   //    printf("%d index : ",i);
   //    //scanf("%d",(ptr +i));
   //     scanf("%d",&aadhar[i]);
   // }          
     
   //   //output

   //   for(int i=0;i<5;i++)
   //   {
   //  //  printf("%d index =  %d\n",i,*(ptr + i));
   //   printf("%d index =  %d\n",i,aadhar[i]);

   //   }

   //#######################@@@@@@@@@@@@@@@@@@@@@@$44444444444444

//    void printNumber(int *arr,int n);
//    int main()
//    {
//       int arr[]= {1,2,3,4,5,6};
//       printNumber(arr,6);
//       return 0;
// }

// void printNumber(int *arr,int n){
// for(int i=0;i<n;i++)
// {
//    printf("%d\t",arr[i]);
// }
// printf("\n");
// }

//@@@@@@@@@@!!!!!!!!!!!!!############$$$$$$$$$%%%%%%%%%%%%

// int marks[2][3];
// marks[0][0]=45;
// marks[0][1]=55;
// marks[0][2]=65;

// marks[1][0]=75;
// marks[1][1]=85;
// marks[1][2]=95;

// printf("%d\n",marks[0][0]);
// printf("%d\n",marks[0][1]);
// printf("%d\n",marks[0][2]);
// printf("%d\n",marks[1][0]);

//$$$$$$$$$$$$%%%%%%%%%%%%%%%%%#########@@@@@@@@@@@@@@
 
//  int arr[] = {1,2,3,4,5,6,8};
//  printf("%d",countodd(arr,7));
//  return 0;
// }

// int countodd(int arr[],int n)
// {
//    int count = 0;
//    for(int  i=0;i<n;i++){
//       if(arr[i] % 2 == 0){
//          count++;
//       }
//    }
//    return count;
// }

//$$$$$$$$$$$$$$$$$$##################@@@@@@@@@@@

// int arr[] = {0,1,2,3,4,9};
// printf("%d\n",*(arr+2));
// printf("%d\n",*(arr + 5));

//#########$$$$$$$$$$$$$$$$$$$%%%%%%%%%%%%%%##########

// void reverse(int arr[] ,int n);
// void printarray(int arr[],int n);

// int main()
// {

// int arr[] = {1,2,3,4,5};
// reverse(arr,5);
// printarray(arr,5);
// //printf("%d",reverse(arr,5));
// return 0;
// }

// void printarray(int arr[],int n){

// for(int i=0;i<n;i++){
//    printf("%d\t",arr[i]);
// }
// printf("\n");
// }

// void reverse(int arr[],int n)
// {

//    for(int i=0;i<n/2;i++)
//    {
//       int firstValue=arr[i];
//       int secondValue=arr[n-i-1];
//       arr[i] = secondValue;
//       arr[n-i-1] = firstValue;
//    }
// }



//#$$%%%%%%%%%%%%%%^^^^^^^^^^^&&&&&&&&&&&&&&##########

// int main ()
// {
//    int n;
//    printf("enter n (n>2):");
//    scanf("%d",&n);

//    int fib[n];
//    fib[0] = 0;
//    fib[1] = 1;

//    for(int i = 2;i<n;i++){
//       fib[i] = fib[i-1] + fib[i-2];
//       printf("%d\t",fib[i]);
//    }
//    printf("\n");
//    return 0;
// }


//#######@@@@@@@@@@@@@@@@@@@@@$$$$$$$$$$$$$$$$$$$$$$

void storeTable(int arr[] [10] , int n,int m, int number);

int main(){
   int tables[2][10];
   storeTable(tables,0,10,2);
    storeTable(tables,1,10,3);
   
   for(int i=0;i<10;i++){
      printf("%d\t",tables[0][i]);
   }
 
   printf("\n");
   for(int i=0;i<10;i++){
      printf("%d\t",tables[1][i]);
   }

   return 0;
}

void storeTable(int arr[][10] , int n, int m, int number){
   for(int i=0;i<m;i++){
   arr[n][i] = number * (i+1);


   }
}
