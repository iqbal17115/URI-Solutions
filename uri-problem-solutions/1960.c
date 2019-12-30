#include <stdio.h>
#include <string.h>
int main(){
  char n[4];
  int length;
  gets(n);
  length=strlen(n);
  if(length==3){
    if(n[0]=='9'){
        printf("CM");
    }else if(n[0]=='8'){
        printf("DCCC");
    }else if(n[0]=='7'){
        printf("DCC");
    }else if(n[0]=='6'){
        printf("DC");
    }else if(n[0]=='5'){
        printf("D");
    }else if(n[0]=='4'){
        printf("CD");
    }else if(n[0]=='3'){
        printf("CCC");
    }else if(n[0]=='2'){
        printf("CC");
    }else if(n[0]=='1'){
        printf("C");
    }

    if(n[1]=='9'){
        printf("XC");
    }else if(n[1]=='8'){
        printf("LXX");
    }else if(n[1]=='7'){
        printf("LXX");
    }else if(n[1]=='6'){
        printf("LX");
    }else if(n[1]=='5'){
        printf("L");
    }else if(n[1]=='4'){
        printf("XL");
    }else if(n[1]=='3'){
        printf("XXX");
    }else if(n[1]=='2'){
        printf("XX");
    }else if(n[1]=='1'){
        printf("X");
    }

    if(n[2]=='9'){
        printf("IX");
    }else if(n[2]=='8'){
        printf("VIII");
    }else if(n[2]=='7'){
        printf("VII");
    }else if(n[2]=='6'){
        printf("VI");
    }else if(n[2]=='5'){
        printf("V");
    }else if(n[2]=='4'){
        printf("IV");
    }else if(n[2]=='3'){
        printf("III");
    }else if(n[2]=='2'){
        printf("II");
    }else if(n[2]=='1'){
        printf("I");
    }

  }
  if(length==2){
    if(n[0]=='9'){
        printf("XC");
    }else if(n[0]=='8'){
        printf("LXXX");
    }else if(n[0]=='7'){
        printf("LXX");
    }else if(n[0]=='6'){
        printf("LX");
    }else if(n[0]=='5'){
        printf("L");
    }else if(n[0]=='4'){
        printf("XL");
    }else if(n[0]=='3'){
        printf("XXX");
    }else if(n[0]=='2'){
        printf("XX");
    }else if(n[0]=='1'){
        printf("X");
    }

    if(n[1]=='9'){
        printf("IX");
    }else if(n[1]=='8'){
        printf("VIII");
    }else if(n[1]=='7'){
        printf("VII");
    }else if(n[1]=='6'){
        printf("VI");
    }else if(n[1]=='5'){
        printf("V");
    }else if(n[1]=='4'){
        printf("IV");
    }else if(n[1]=='3'){
        printf("III");
    }else if(n[1]=='2'){
        printf("II");
    }else if(n[1]=='1'){
        printf("I");
    }
  }
  if(length==1){
    if(n[0]=='9'){
        printf("IX");
    }else if(n[0]=='8'){
        printf("VIII");
    }else if(n[0]=='7'){
        printf("VII");
    }else if(n[0]=='6'){
        printf("VI");
    }else if(n[0]=='5'){
        printf("V");
    }else if(n[0]=='4'){
        printf("IV");
    }else if(n[0]=='3'){
        printf("III");
    }else if(n[0]=='2'){
        printf("II");
    }else if(n[0]=='1'){
        printf("I");
    }
  }
  printf("\n");
  return 0;
}


