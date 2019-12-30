import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
       int s=1,j,a;
       while(input.hasNext()){
           int N;
           N=input.nextInt();
           int x=0;
           for (int i = 0; i <= N; i++) {
               if(i == 0){
                   x=1;
               }else{
               for (j = 0; j < i; j++) {
                   x++;
               }
               }
           }
           if(N == 0){
               System.out.println("Caso "+(s++)+": "+x+" numero");
               System.out.println("0");
               System.out.println();
           }else{
           a=0;
            System.out.println("Caso "+(s++)+": "+x+" numeros");
               System.out.print("0");
           for (int i = 0; i <= N; i++) {
               for (j = 0; j < i; j++) {
                   System.out.print(" "+a);
               }
              a++;
           }
               System.out.println();
               System.out.println();
           }
       }
       input.close();
 
    }
 
}