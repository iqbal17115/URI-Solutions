#include<stdio.h>
int main(){
float salary,increase=0;
scanf("%f",&salary);
if(0<salary && salary<=400.00 ){
    increase=(salary*15)/100;
    salary=salary+increase;
    printf("Novo salario: %.2f\n",salary);
    printf("Reajuste ganho: %.2f\n",increase);
    printf("Em percentual: 15 %%\n");
}
else if(400.01<=salary && salary<=800.00 ){
    increase=(salary*12)/100;
    salary=salary+increase;
    printf("Novo salario: %.2f\n",salary);
    printf("Reajuste ganho: %.2f\n",increase);
    printf("Em percentual: 12 %%\n");
}
else if(800.01<=salary && salary<=1200.00 ){
    increase=(salary*10)/100;
    salary=salary+increase;
    printf("Novo salario: %.2f\n",salary);
    printf("Reajuste ganho: %.2f\n",increase);
    printf("Em percentual: 10 %%\n");
}
else if(1200.01<=salary && salary<=2000.00 ){
    increase=(salary*7)/100;
    salary=salary+increase;
    printf("Novo salario: %.2f\n",salary);
    printf("Reajuste ganho: %.2f\n",increase);
    printf("Em percentual: 7 %%\n");
}
else{
    increase=(salary*4)/100;
    salary=salary+increase;
    printf("Novo salario: %.2f\n",salary);
    printf("Reajuste ganho: %.2f\n",increase);
    printf("Em percentual: 4 %%\n");
}
return 0;
}
