import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
      int A,B,C;
      while(input.hasNext()){
          A=input.nextInt();
          B=input.nextInt();
          if( A > B){
              C=A;
          }else{
              C=B;
          }
          System.out.println(C);
      }
 
    }
 
}