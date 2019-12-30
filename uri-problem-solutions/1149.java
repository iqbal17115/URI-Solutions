import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
   int A,N,sum=0;
   A=input.nextInt();
   N=input.nextInt();
   while(N <= 0){
       N=input.nextInt();
   }
       for (int i = 0; i < N; i++) {
           sum=sum+i+A;
       }
    System.out.println(sum);
 
    }
 
}