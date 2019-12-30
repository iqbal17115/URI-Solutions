#include<stdio.h>
int main(){
double x1,y1,x2,y2,result1,result2;
scanf("%lf%lf",&x1,&y1);
scanf("%lf%lf",&x2,&y2);
result1=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
result2=sqrt(result1);
printf("%.4lf\n",result2);
return 0;
}
