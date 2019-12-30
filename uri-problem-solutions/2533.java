import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input=new Scanner(System.in);
       int Ni,Ci;
       int N;
       while(input.hasNext()){
       N=input.nextInt();
       float result=0,result1=0;
           for (int i = 0; i < N; i++) {
               Ni=input.nextInt();
               Ci=input.nextInt();
               result=result+(Ni*Ci);
               result1=result1+Ci;
           }
           float p;
           p=(result/(result1*100));
           System.out.printf("%.4f\n",p);
       }
       input.close();
 
    }
 
}