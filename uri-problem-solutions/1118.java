import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner input=new Scanner(System.in);
        int X = 0;
        float num,avg;
       do{
           int p=0;
           float sum=0;
          while(p != 2){
              num=input.nextFloat();
              if(num < 0 || num > 10){
                  System.out.println("nota invalida");
              }
              else{
                  sum=sum+num;
                  p++;
              }
          }
           System.out.printf("media = %.2f\n",(sum/2));
           int m=0;
          while(m != 1 ){  
               System.out.println("novo calculo (1-sim 2-nao)");
               m=input.nextInt();
                 if(m==2){
                  X=m;
                  break;
              }
           }
       }while(X != 2);
 
    }
 
}