import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
       int n=0,a=0,g=0,d=0;
       while(n != 4){
           n=input.nextInt();
           if(n==1){
               a++;
           }
           else if(n==2){
               g++;
           }
           else if(n==3){
               d++;
           }
       }
           System.out.println("MUITO OBRIGADO");
           System.out.println("Alcool: "+a);
           System.out.println("Gasolina: "+g);
           System.out.println("Diesel: "+d);
 
    }
 
}