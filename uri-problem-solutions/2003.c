#include <stdio.h>
int main()
{
    int hr,min;
   while(scanf("%d",&hr) != EOF){
        scanf(":%d",&min);
        if(hr == 5){
            printf("Atraso maximo: 0\n");
        }
        else if(hr == 6){
            printf("Atraso maximo: 0\n");
        }
        else if(hr == 7){
            printf("Atraso maximo: %d\n",min);

        }
        else if(hr == 8){
            printf("Atraso maximo: %d\n",(min+60));
        }
         else if(hr == 9){
            printf("Atraso maximo: 120\n");
        }
        else{
             printf("Atraso maximo: 0\n");
        }
      }
}
