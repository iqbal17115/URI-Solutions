import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
      int n,p=0;
      float avg,sum=0;
      while((n=input.nextInt()) >= 0){
          sum= sum+n;
          p++;
      }
      avg=(float) (float) (sum/p);
      System.out.printf("%.2f\n",avg);
 
    }
 
}