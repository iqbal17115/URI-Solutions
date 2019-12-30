#include<stdio.h>
int main(){
int time,speed;
double result;
scanf("%d%d",&time,&speed);
result=(double) (time*speed)/12;
printf("%.3lf\n",result);
return 0;
}
