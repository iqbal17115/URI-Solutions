#include<stdio.h>
int main(){
      double sum=0.0;
      int p=11,q=1,i,j;
      char O;
      double M[12][12];
      scanf("%c",&O);
        for (i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                scanf("%lf",&M[i][j]);
            }
        }
        for (i = 0; i < 12; i++) {
            for (j = q; j < p; j++) {
                sum=sum+M[i][j];
            }
            q++;
            p--;
        }
        if(O == 'S'){
            printf("%.1lf\n",sum);
        }
        else if(O == 'M'){
            sum=sum/30;
            printf("%.1lf\n",sum);
        }
}
