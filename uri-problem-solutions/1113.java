import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
     int X,Y;
     while((X=input.nextInt()) != ((Y=input.nextInt()))){
         if(X < Y){
             System.out.println("Crescente");
         }
         else{
             System.out.println("Decrescente");
         }
     }
 
    }
 
}