import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner input=new Scanner(System.in);
      int V;
      while(input.hasNext()){
          V=input.nextInt();
          System.out.printf("%X\n",V);
      }
      input.close();
 
    }
 
}