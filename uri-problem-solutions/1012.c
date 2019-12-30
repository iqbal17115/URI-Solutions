#include<stdio.h>
int main(){
 double A,B,C,pi=3.14159,tri,cir,tra,sq,rect;
 scanf("%lf%lf%lf",&A,&B,&C);
 tri=(A*C)/2;
 cir=pi*C*C;
 tra=((A+B)/2)*C;
 sq=B*B;
 rect=A*B;
 printf("TRIANGULO: %.3lf\nCIRCULO: %.3lf\nTRAPEZIO: %.3lf\nQUADRADO: %.3lf\nRETANGULO: %.3lf\n",tri,cir,tra,sq,rect);
}
