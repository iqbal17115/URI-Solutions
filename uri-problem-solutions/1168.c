#include <stdio.h>
#include <string.h>
int main(){
  int n,i,total,len;
  char ch[1000],ch1[10];
  scanf("%d",&n);
  gets(ch1);
  while(n>0){
    gets(ch);
    len=strlen(ch);
    total=0;
    for(i=0;i<len;i++){
        if(ch[i]=='0'){
            total=total+6;
        }else if(ch[i]=='1'){
            total=total+2;
        }else if(ch[i]=='2'){
            total=total+5;
        }else if(ch[i]=='3'){
            total=total+5;
        }else if(ch[i]=='4'){
            total=total+4;
        }else if(ch[i]=='5'){
            total=total+5;
        }else if(ch[i]=='6'){
            total=total+6;
        }else if(ch[i]=='7'){
            total=total+3;
        }else if(ch[i]=='8'){
            total=total+7;
        }else if(ch[i]=='9'){
            total=total+6;
        }
    }
    printf("%d leds\n",total);
    n--;
  }
  return 0;
}

