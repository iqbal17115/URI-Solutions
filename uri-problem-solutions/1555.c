#include <stdio.h>
int main(){
  int n;
  scanf("%d",&n);
  int i, j,k;
  long long x, y, r, b, c;
  for(i=0;i<n;i++){
    scanf("%lld%lld",&x,&y);
    r=((3*x)*(3*x))+(y*y);
    b=(2*(x*x))+((5*y)*(5*y));
    c=(-100*x)+(y*y*y);
    if(r>b && r>c){
         printf("Rafael ganhou\n");
    }else if(b>r && b>c){
         printf("Beto ganhou\n");
    }else{
         printf("Carlos ganhou\n");
    }
  }
}

