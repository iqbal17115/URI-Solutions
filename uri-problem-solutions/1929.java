import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
                Scanner input=new Scanner(System.in);
     int A,B,C,D,temp;
     A=input.nextInt();
     B=input.nextInt();
     C=input.nextInt();
     D=input.nextInt();
     if(A < B){
         temp=A;
         A=B;
         B=temp;
     }
     if(A < C){
         temp=A;
         A=C;
         C=temp;
     }
     if(A < D){
         temp=A;
         A=D;
         D=temp;
     }
     if(B < C){
         temp=B;
         B=C;
         C=temp;
     }
     if(B < D){
         temp=B;
         B=D;
         D=temp;
     }
     if(C < D){
         temp=C;
         C=D;
         D=temp;
     }
     if((A < B+C) || (B < C+D)){
         System.out.println("S");
     }else{
         System.out.println("N");
     }
 
    }
 
}