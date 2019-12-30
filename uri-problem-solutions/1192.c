#include <stdio.h>
#include <stdlib.h>
int main(){
 int n;
 char str[5];
 scanf("%d",&n);
 int num1, num2;
 while(n>=0){
        gets(str);
    if(str[0]=='1'){
        num1=1;
    }else if(str[0]=='2'){
        num1=2;
    }else if(str[0]=='3'){
        num1=3;
    }else if(str[0]=='4'){
        num1=4;
    }else if(str[0]=='5'){
        num1=5;
    }else if(str[0]=='6'){
        num1=6;
    }else if(str[0]=='7'){
        num1=7;
    }else if(str[0]=='8'){
        num1=8;
    }else if(str[0]=='9'){
        num1=9;
    }else if(str[0]=='0'){
        num1=0;
    }

    if(str[2]=='1'){
        num2=1;
    }else if(str[2]=='2'){
        num2=2;
    }else if(str[2]=='3'){
        num2=3;
    }else if(str[2]=='4'){
        num2=4;
    }else if(str[2]=='5'){
        num2=5;
    }else if(str[2]=='6'){
        num2=6;
    }else if(str[2]=='7'){
        num2=7;
    }else if(str[2]=='8'){
        num2=8;
    }else if(str[2]=='9'){
        num2=9;
    }else if(str[2]=='0'){
        num2=0;
    }
    if(num1==num2){
        printf("%d\n",(num1*num2));
    }else if(str[1]>='A' && str[1]<='Z'){
        printf("%d\n",(num2-num1));
    }else if(str[1]>='a' && str[1]<='z'){
        printf("%d\n",(num1+num2));
    }
    n--;
 }
return 0;
}

