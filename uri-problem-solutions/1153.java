import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int N,fact=1;
     Scanner input=new Scanner(System.in);
     N=input.nextInt();
        for (int i = 1; i <= N; i++) {
            fact=fact*i;
        }
        System.out.print(fact+"\n");
 
    }
 
}