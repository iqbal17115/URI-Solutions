#include<stdio.h>
int main()
{
    int n, i;
    long long int a,b;
    scanf("%d",&n);
        for(i=0;i<n;i++){
        scanf("%lld %lld",&a,&b);
     if(a >= b)
        {
            while(b != 0)
            {
                if(b%10 != a%10)
                {
                    printf("nao encaixa\n");
                    goto end;
                }
                a/=10;
                b/=10;
            }
            printf("encaixa\n");
        }
        else
        {
            printf("nao encaixa\n");
        }
        end:;
    }
    return 0;
}
