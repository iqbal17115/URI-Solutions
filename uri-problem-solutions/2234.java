import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
       float M,P;
       float c;
      M=input.nextFloat();
      P=input.nextFloat();
      c=M/P;
      System.out.printf("%.2f\n",c);
 
    }
 
}