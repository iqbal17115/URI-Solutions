#include <stdio.h>
int main(){
   long long n, sum;
   while(scanf("%lld",&n)){
         if(n==0){
            break;
         }
    sum=0;
    while(n>0){
        sum +=(n*n);
        n--;
    }
    printf("%lld\n",sum);
   }
}

