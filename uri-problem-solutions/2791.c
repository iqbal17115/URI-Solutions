#include <stdio.h>
int main(){
  int c[5], i;
  for(i=0;i<4;i++){
    scanf("%d",&c[i]);
  }
  for(i=0;i<4;i++){
    if(c[i]==1){
        break;
    }
  }
  printf("%d\n",++i);
}

