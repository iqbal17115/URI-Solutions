import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
                Scanner input=new Scanner(System.in);
    int V;
    int[] N=new int[10];
    V=input.nextInt();
        for (int i = 0; i < 10; i++) {
            N[i]=V;
            System.out.println("N["+i+"] = "+N[i]);
            V=V*2;
        }
 
    }
 
}