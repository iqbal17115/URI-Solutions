import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
                Scanner input=new Scanner(System.in);
       int N,X;
       N=input.nextInt();
        for (int i = 1; i <= N; i++) {
           
            X=input.nextInt();
             boolean p=true;
            for (int j = 2; j < X; j++) {
                if(X % j ==0){
                    p=false; 
                }
            }
           if(p){
               System.out.println(X+" eh primo");
           }
           else{
               System.out.println(X+" nao eh primo");
           }
        }
 
    }
 
}