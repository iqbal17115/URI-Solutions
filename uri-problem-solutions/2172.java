import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
       int X;
       long M,E;
       while((X=input.nextInt()) !=0 && (M=input.nextInt()) != 0){
           E=X*M;
           System.out.println(E);
       }
 
    }
 
}