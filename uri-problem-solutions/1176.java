import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
                Scanner input=new Scanner(System.in);
      long N;
      int T;
      T=input.nextInt();
        for (int i = 0; i < T; i++) {
            N=input.nextInt();
            long x=0,y=1,temp;
            if(N == 0){
                System.out.println("Fib("+N+") = "+x);
                continue;
            }else{
            for (int j = 0; j < N-1; j++) {
                temp=x+y;
                x=y;
                y=temp;
            }
            System.out.println("Fib("+N+") = "+y);
            }
        }
 
    }
 
}