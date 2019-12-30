import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
     int N;
     double result=0.0;
     N=input.nextInt();
     while(N != 0){
         result +=2.0;
         result=1/result;
         N--;
     }
     result=result+1.0;
        System.out.printf("%.10f\n",result);
 
    }
 
}