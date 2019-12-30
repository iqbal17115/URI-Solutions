import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
      int X;
     
        while((X=input.nextInt()) != 0){
            for (int i = 1; i <= X; i++) {
                
                if(i == X){
                    System.out.printf("%d\n",i);
                }
                else{
                    System.out.print(i+" ");
                }
            }
         
        }
 
    }
 
}