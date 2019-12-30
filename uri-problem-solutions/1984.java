import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          String n;
      Scanner input=new Scanner(System.in);
      n=input.nextLine();
        String[] p=n.split("");
        int c=p.length-1;
        for (int i = c; i >= 0 ; i--) {
            System.out.print(p[i]);
        }
        System.out.println();
 
    }
 
}