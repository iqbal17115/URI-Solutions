import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
Scanner input=new Scanner(System.in);
int[] par=new int[20];
int[] impar=new int[20];
int n,even=-1,odd=-1;
        for (int i = 0, e=0, o=0; i < 15;  i++) {
            n=input.nextInt();
            if(n%2 == 0){
                par[e]=n;
                even++;
                e++;
                if(even == 4){
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par["+j+"] = "+par[j]);
                        par[j]=0;
                    }
                    e=0;
                    even=-1;
                }
                } else{
                impar[o]=n;
                odd++;
                o++;
                if(odd == 4){
                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar["+j+"] = "+impar[j]);
                        impar[j]=0;
                    }
                    o=0;
                    odd=-1;
                }
                }
            }
      int p=0,q=0;
      while(impar[q] != 0){
           System.out.println("impar["+q+"] = "+impar[q]);
           q++;
      }
      while(par[p] != 0){
           System.out.println("par["+p+"] = "+par[p]);
           p++;
      }
 
    }
 
}