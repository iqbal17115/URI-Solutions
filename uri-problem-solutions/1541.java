import java.io.IOException;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
     int A,B,C;
     while((A=input.nextInt()) != 0){
         B=input.nextInt();
         C=input.nextInt();
         int p,q;
         p=(int) sqrt(((A*B)*100)/C);
         System.out.println(p);
     }
 
    }
 
}