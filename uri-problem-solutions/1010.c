#include<stdio.h>
int main(){
    int A,B;
    float C,rest;
    scanf("%d%d%f",&A,&B,&C);
    rest=B*C;
    scanf("%d%d%f",&A,&B,&C);
    rest+=B*C;
    printf("VALOR A PAGAR: R$ %.2f\n",rest);
return 0;
}
