#include <stdio.h>
int main(){
  long long num1, num2;
  while(scanf("%lld%lld",&num1,&num2) != EOF){
    if(num1<num2){
        printf("%lld\n",(num2-num1));
    }else{
        printf("%lld\n",(num1-num2));
    }
  }
 return 0;
}

