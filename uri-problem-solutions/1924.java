import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          int n;
       Scanner input=new Scanner(System.in);
       n=input.nextInt();
       input.nextLine();
       String[] s=new String[2000];
        for (int i = 0; i < n; i++) {
            s[i]=input.nextLine();
        }
        System.out.println("Ciencia da Computacao");
 
    }
 
}