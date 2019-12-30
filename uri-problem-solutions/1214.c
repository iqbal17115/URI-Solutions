#include <stdio.h>
int main(){
  int c,i,j,n,k;
  float result,count,sum,avg,grade[1000];
  scanf("%d",&c);
  for(i=0;i<c;i++){
        sum=0.0;
        count=0.0;
    scanf("%d",&n);
    for(j=0;j<n;j++){
        scanf("%f",&grade[j]);
        sum +=grade[j];
    }
    avg=sum/n;
  for(k=0;k<n;k++){
    if(grade[k]>avg){
        count++;
    }
  }
  result=(count*100)/n;
  printf("%.3f%c\n",result,'%');
  }

  return 0;
}

