import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               int C;
       Scanner input=new Scanner(System.in);
       C=input.nextInt();
       input.nextLine();
       String s;
       double T;
        for (int i = 0; i < C; i++) {
            s=input.next();
            T=s.length();
            System.out.printf("%.2f\n",T/100);
        }
 
    }
 
}