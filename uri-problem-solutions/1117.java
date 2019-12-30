import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
     float x,y,p=0,sum=0;
     while(p!=2){
         x=input.nextFloat();
         if((x>=0) &&(x<=10)){
         sum=sum+x;
         p++;
     }
         else{
             System.out.println("nota invalida");
         }
     }
        System.out.printf("media = %.2f\n",(sum/2));
 
    }
 
}