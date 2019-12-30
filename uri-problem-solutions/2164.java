import java.io.IOException;
 import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input=new Scanner(System.in);
       int n;
       n=input.nextInt();
       double result;
       result=(((pow((1+sqrt(5))/2,n))-(pow((1-sqrt(5))/2,n)))/sqrt(5));
        System.out.printf("%.1f\n",result);
 
    }
 
}