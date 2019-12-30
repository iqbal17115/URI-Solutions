#include <stdio.h>
#include <string.h>
int main(){
  int i, j, n, k, len, flag=0;
  char s[25], temp[25];
  scanf("%d",&n);
  while(n>0){
        flag=0;
    scanf("%d",&k);
    for(i=0;i<k;i++){
        scanf("%s",s);
        if(i==0){
            len=strlen(s);
         for(j=0;j<len+1;j++){
            temp[j]=s[j];
         }
        }
        if(strcmp(s, temp)!=0){
            flag=1;
        }
    }
    if(flag==1){
        printf("ingles\n");
    }else{
        printf("%s\n",s);
    }
    n--;
  }
  return 0;
}

