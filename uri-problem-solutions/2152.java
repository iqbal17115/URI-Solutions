import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
        int T,H,M,O;
        T=input.nextInt();
        for (int i = 0; i < T; i++) {
           H=input.nextInt();
           M=input.nextInt();
           O=input.nextInt();
           if(O == 0){
               if(H <= 9){
                   System.out.print("0"+H+":");
               }else{
                   System.out.print(H+":");
               }
               if(M <= 9){
                   System.out.print("0"+M+" - A porta fechou!");
               }else{
                   System.out.print(M+" - A porta fechou!");
               }
           }else{
               if(H <= 9){
                   System.out.print("0"+H+":");
               }else{
                   System.out.print(H+":");
               }
               if(M <= 9){
                   System.out.print("0"+M+" - A porta abriu!");
               }else{
                   System.out.print(M+" - A porta abriu!");
               }
           }
            System.out.println();
        }
 
    }
 
}