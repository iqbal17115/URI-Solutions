#include <stdio.h>
int main(){
  int t, i, n, k, result;
  scanf("%d",&t);
  for(i=0;i<t;i++){
    scanf("%d%d",&n,&k);
    result=(n/k)+(n%k);
    printf("%d\n",result);
  }
  return 0;
}

