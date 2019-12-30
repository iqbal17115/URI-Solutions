import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
      int N;
      while(input.hasNext()){
          N=input.nextInt();
          if(N == 0){
              System.out.println("vai ter copa!");
          }
          else{
              System.out.println("vai ter duas!");
          }
      }
      input.close();
 
    }
 
}