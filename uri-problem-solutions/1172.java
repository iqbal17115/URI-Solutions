import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
       int[] X=new int[10];
       int x;
        for (int i = 0; i < 10; i++) {
            X[i]=input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(X[i] <= 0){
                X[i]=1;
            }
            System.out.println("X["+i+"] = "+X[i]);
        }
 
    }
 
}