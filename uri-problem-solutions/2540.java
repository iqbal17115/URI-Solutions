import java.io.IOException;
 import static java.lang.Math.ceil;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
       int N;
       double a,b,c;
       double result;
       while(input.hasNext()){
           N=input.nextInt();
           int[] v=new int[N];
           a=0;
           b=0;
           c=0;
           for (int i = 0; i < N; i++) {
               v[i]=input.nextInt();
               a++;
               if(v[i] == 1){
                   b++;
               }
               if(v[i] == 0){
                   c++;
               }
           }
           result=(double) (ceil(a*2)/3);
           if(b >= result){
               System.out.println("impeachment");
           }else{
               System.out.println("acusacao arquivada");
           }
       }
 
    }
 
}