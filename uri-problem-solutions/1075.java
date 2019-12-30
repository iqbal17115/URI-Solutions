import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
      int N;
      N=input.nextInt();
      
        for (int i = 0; ((i*N)+2) < 10000; i++) {           
                System.out.println(((i*N)+2));
           
        }
 
    }
 
}