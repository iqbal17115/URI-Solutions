#include <stdio.h>
int main(){
   int c;
   long long n;
   scanf("%d",&c);
   while(c!=0){
    scanf("%lld",&n);
    if(n > 8000){
        printf("Mais de 8000!\n");
    }else{
        printf("Inseto!\n");
    }
    c--;
   }
}

