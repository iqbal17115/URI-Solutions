#include<stdio.h>
int main(){
float A,B,C,temp,r1,r2;
scanf("%f%f%f",&A,&B,&C);
temp=(B*B)-(4*A*C);
if(temp > 0 && A!=0){
    temp=sqrt(temp);
    r1=(-B+temp)/(2*A);
    r2=(-B-temp)/(2*A);
    printf("R1 = %.5f\n",r1);
    printf("R2 = %.5f\n",r2);
}
else{
    printf("Impossivel calcular\n");
}
return 0;
}
