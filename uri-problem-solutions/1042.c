#include<stdio.h>
int main(){
int array1[3],array2[3],i,j;
for(i=0;i<3;i++){
    scanf("%d",&array1[i]);
}
for(i=0;i<3;i++){
    array2[i]=array1[i];
}
for(i=0;i<2;i++){
    for(j=i+1;j<3;j++){
        if(array1[i]>array1[j]){
            int temp;
            temp=array1[i];
            array1[i]=array1[j];
            array1[j]=temp;
        }
    }
}
for(i=0;i<3;i++){
    printf("%d\n",array1[i]);
}
printf("\n");
for(i=0;i<3;i++){
    printf("%d\n",array2[i]);
}
}
