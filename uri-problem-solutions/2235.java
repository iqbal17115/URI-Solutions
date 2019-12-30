import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
     int A,B,C;
     A=input.nextInt();
     B=input.nextInt();
     C=input.nextInt();
     if(A-B == 0){
         System.out.println("S");
     }
     else if(A-C == 0){
         System.out.println("S");
     }
     else if(B-C == 0){
         System.out.println("S");
     }
     else if(((A+B)-C) == 0){
         System.out.println("S");
     }
     else if(((B+C)-A) == 0){
         System.out.println("S");
     }
     else if(((C+A)-B) == 0){
         System.out.println("S");
     }
     else{
         System.out.println("N");
     }
 
    }
 
}