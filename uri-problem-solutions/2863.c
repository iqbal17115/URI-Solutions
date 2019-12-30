#include <stdio.h>
int main(){
  int t, i;
  float ti[110], temp;
  while(scanf("%d",&t)!=EOF){
    for(i=0;i<t;i++){
     scanf("%f",&ti[i]);
    }
    temp=ti[0];
    for(i=0;i<t;i++){
     if(ti[i]<temp){
        temp=ti[i];
     }
    }
    printf("%.2f\n",temp);
  }
}

