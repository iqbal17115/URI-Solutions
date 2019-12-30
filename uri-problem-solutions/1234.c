#include <stdio.h>
#include <string.h>
int main(){
    char ch[60],ch1[10];
while(gets(ch)!=NULL){
      int n,i,flag=0,flag1,len;
  len=strlen(ch);
  for(i=0;i<len;i++){
    while(ch[i]==32){
        i++;
    }
    if(flag==0){
        flag=1;
        if(ch[i]>='a' && ch[i]<='z'){
            ch[i]=ch[i]-32;
        }
    }else if(flag==1){
        flag=2;
        if(ch[i]>='A' && ch[i]<='Z'){
            ch[i]=ch[i]+32;
        }
    }else if(flag==2){
        flag=1;
       if(ch[i]>='a' && ch[i]<='z'){
            ch[i]=ch[i]-32;
        }
    }

  }
  printf("%s\n",ch);
}
  return 0;
}

