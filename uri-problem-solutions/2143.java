import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
        int T;
        int a;
       while((T=input.nextInt()) != 0){
           for (int i = 0; i < T; i++) {
               a=input.nextInt();
               if(a%2 != 0){
                   System.out.println(a*2-1);
               }else{
                   System.out.println(a*2-2);
               }
           }
       }
 
    }
 
}