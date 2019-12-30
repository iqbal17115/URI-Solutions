import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
   int N,X;
   N=input.nextInt();
        for (int i = 0; i < N; i++) {
            int sum=0;
            X=input.nextInt();
            for (int j = 1; j < X; j++) {
                if(X % j == 0){
                    sum=sum+j;
                }
            }
            if(sum == X){
                System.out.println(X+" eh perfeito");
            }
            else{
                System.out.println(X+" nao eh perfeito");
            }
        }
 
    }
 
}