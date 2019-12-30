import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
    int[] N=new int[20];
    int Y,m;
        for (int i = 0; i < 20; i++) {
            Y=input.nextInt();
            N[i]=Y;
        }
        for (int i = 0; i <= 9; i++) {
            m=N[19-i];
            N[19-i]=N[i];
            N[i]=m;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("N["+i+"] = "+N[i]);
        }
 
    }
 
}