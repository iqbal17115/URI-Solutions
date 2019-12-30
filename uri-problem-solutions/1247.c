#include <stdio.h>
int main(){
  double d, vf, vg, distance1=12, distance2, time1,time2;
  while(scanf("%lf%lf%lf",&d,&vf,&vg)==3){
    distance2=sqrt((d*d)+(distance1*distance1));
    time1=distance2/vg;
    time2=distance1/vf;
    if(time1<=time2){
        printf("S\n");
    }else{
        printf("N\n");
    }
  }
}

