import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
       int N,M,result,b;
       while((N=input.nextInt()) != 0 && (M=input.nextInt()) != 0){
           result=M-N;
           b=0;
           if(result >= 100){
               result=result-100;
               b++;
           }
           if(result >= 50){
               result=result-50;
               b++;
           }
           if(result >= 20){
               result=result-20;
               b++;
           }
           if(result >= 10){
               result=result-10;
               b++;
           }
           if(result >= 5){
               result=result-5;
               b++;
           }
           if(result >= 2){
               result=result-2;
               b++;
           }
           if(b == 2 && result == 0){
               System.out.println("possible");
              
           }else{
               System.out.println("impossible");
           }
       }
 
    }
 
}