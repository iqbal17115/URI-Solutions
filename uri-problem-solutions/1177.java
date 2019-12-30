import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
       int T,x;
       int[] N=new int[1000];
       T=input.nextInt();
        for (int j = 0,p=0; j < 1000;p++, j++) {
            N[p]=p;
            if(N[p] == T){
                p=0;
            }
            System.out.println("N["+j+"] = "+N[p]);
        }
       
 
    }
 
}