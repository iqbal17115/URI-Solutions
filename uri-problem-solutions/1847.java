import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
       int A,B,C;
       A=input.nextInt();
       B=input.nextInt();
       C=input.nextInt();
       if(B < A && (C > B || C == B)){
           System.out.println(":)"); 
       }
       else if(B > A && (C < B || C == B)){
           System.out.println(":(");
       }
       else if((B > A) && (C > B) && ((B - A) > (C - B))){
           System.out.println(":(");
       }
       else if((B > A) && (C > B) && ((B - A) <= (C - B))){
           System.out.println(":)");
       }
       else if(((B < A) && (C < B)) && ((B - C) < (A - B))){
           System.out.println(":)");
       }
       else if(((B < A) && (C < B)) && ((B - C) >= (A - B))){
           System.out.println(":(");
       }
       else if(A == B){
           if(C > B){
           System.out.println(":)");
           }
           else{
               System.out.println(":(");
           }
       }
 
    }
 
}