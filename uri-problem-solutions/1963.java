import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           float A,B,increase,percentage;
       Scanner input=new Scanner(System.in);
       A=input.nextFloat();
       B=input.nextFloat();
       increase=B-A;
       percentage=(increase*100)/A;
       System.out.printf("%.2f%%\n",percentage);
 
    }
 
}