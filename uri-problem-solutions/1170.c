#include <stdio.h>
int main(){
   int n, day, i;
   float x;
   scanf("%d",&n);
   for(i=0;i<n;i++){
     day=0;
     scanf("%f",&x);
     while(x > 1){
        day++;
        x /= 2;
     }
     printf("%d dias\n",day);
   }
   return 0;
}

