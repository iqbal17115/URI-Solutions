import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           long  N,L,P;
      Scanner input=new Scanner(System.in);
      while(input.hasNext()){
      N=input.nextInt();
      L=input.nextInt();
      P=N*L;
        System.out.println(P);
      }
      input.close();
 
    }
 
}