#include <stdio.h>
#include <string.h>
int main(){
 int n, m;
 while(scanf("%d%d",&m,&n) != EOF){
    long long sum1=1, sum2=1, i, j;
    for(i=1;i<=m;i++){
        sum1 *= i;
    }
    for(i=1;i<=n;i++){
        sum2 *= i;
    }
    printf("%lld\n",(sum1+sum2));
 }
 return 0;
}

