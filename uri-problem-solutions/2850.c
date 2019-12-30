#include<stdio.h>
#include<string.h>
int main()
{

    char str[30];
    int r1, r2, r3, r4;
    while(gets(str)){
    r1=strcmp(str,"direita");
    r2=strcmp(str,"esquerda");
    r3=strcmp(str,"nenhuma");
    r4=strcmp(str,"as duas");

    if(r1==0){
        printf("frances\n");
    }else if(r2==0){
        printf("ingles\n");
    }else if(r3==0){
        printf("portugues\n");
    }else if(r4==0){
        printf("caiu\n");
    }
    }
    return 0;
}

