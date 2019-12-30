#include<stdio.h>
int main(){
int number,hours;
float salary,amount;
scanf("%d%d%f",&number,&hours,&salary);
amount=salary*hours;
printf("NUMBER = %d\nSALARY = U$ %.2f\n",number,amount);
return 0;
}
