#include <stdio.h>
int main(){
 int n, i, j, len;
 scanf("%d",&n);
 char str[10], ch[10];
 gets(ch);
 while(n>0){
    gets(str);
    len=strlen(str);
    if(len==5){
        printf("3\n");
    }else if((str[0]=='t' && str[1]=='w')||(str[0]=='t' && str[2]=='o')||(str[1]=='w' && str[2]=='o')){
        printf("2\n");
    }else{
        printf("1\n");
    }
    n--;
 }
}

