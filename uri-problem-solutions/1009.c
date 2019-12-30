#include<stdio.h>
int main(){
    char name;
    double salary,values,total;
    scanf("%s%lf%lf",&name,&salary,&values);
    total=(salary+values*.15);
    printf("TOTAL = R$ %.2lf\n",total);
return 0;
}
