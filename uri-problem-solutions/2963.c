#include <stdio.h>
int main(){
    long long n, m, v[100000],high;
    scanf("%lld",&n);
    m=n;
    int i=0;
    while(n>0){
        scanf("%lld",&v[i++]);
        n--;
    }

    high=v[0];
    for(i=1;i<m;i++){
        if(v[i]>high){
            high=v[i];
        }
    }
    if(v[0]==high){
        printf("S\n");
    }else{
        printf("N\n");
    }
}

