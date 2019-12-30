#include <stdio.h>
int main(){
    int n, i, len, j,k,l, p, q;
    char m[1000], m1[1000],c,str[90];
    scanf("%d",&n);
    fgets(str, 100, stdin);
    for(i=0;i<n;i++){
        gets(m);
        len=strlen(m);
        for(j=0;j<len;j++){
            if((m[j]<='z' && m[j]>='a') || (m[j]<='Z' && m[j]>='A')){
                m[j]=m[j]+3;
            }
        }
        k=0;
        for(j=len-1;j>=0;j--){
            m1[k]=m[j];
            k++;
        }
       p=len/2;

       for(q=p;q<len;q++){
        m1[q]=m1[q]-1;
       }
       for(l=0;l<len;l++){
        printf("%c",m1[l]);
       }
       printf("\n");
    }

    return 0;
}

