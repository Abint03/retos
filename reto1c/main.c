#include <stdio.h>
#include <stdlib.h>

int main()
{
    for(int i=1; i<=100;i++){
        if(i%3==0 && i%5!=0){
            printf("fizz\n");
        }
        if(i%5==0 && i%3!=0){
            printf("buzz\n");
        }
        if(i%5==0 && i%3==0){
            printf("fizzbuzz\n");
        }
        if(i%5!=0 && i%3!=0){
            printf("%i\n",i);
        }
    }
    return 0;
}
