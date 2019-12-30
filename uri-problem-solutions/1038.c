#include<stdio.h>
int main(){
int X,Y;
float p1,p2,p3,p4,p5;
scanf("%d%d",&X,&Y);
if(X==1){
  p1=Y*4.00;
  printf("Total: R$ %.2f\n",p1);
}
else if(X==2){
  p2=Y*4.50;
  printf("Total: R$ %.2f\n",p2);
}
else if(X==3){
  p3=Y*5.00;
  printf("Total: R$ %.2f\n",p3);
}
else if(X==4){
  p4=Y*2.00;
  printf("Total: R$ %.2f\n",p4);
}
else if(X==5){
  p5=Y*1.50;
  printf("Total: R$ %.2f\n",p5);
}
return 0;
}

