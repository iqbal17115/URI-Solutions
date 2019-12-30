#include <stdio.h>
int main(){
  long long n, x,flag;
  scanf("%lld",&n);
  int i, j;
  for(i=0;i<n;i++){
    scanf("%lld",&x);
    flag=0;
    if(x==0){
        flag=1;
    }else if(x==1){
        flag=1;
    }else if(x==2){
        flag=0;
    }else{
    for(j=2;j<sqrt(x)+1;j++){
        if(x%j==0){
            flag=1;
            break;
        }
    }
    }
   if(flag==0){
     printf("Prime\n");
   }else{
     printf("Not Prime\n");
   }
  }
}

