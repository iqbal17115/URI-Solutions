import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
      int N,p=1;
      N=input.nextInt();
      int[] T=new int[N];
        for (int i = 0; i < N; i++) {
            T[i]=input.nextInt();
        }
        int x=T[0];
        for (int i = 0; i < N; i++) {
            if(x > T[i]){
                x=T[i];
                p=i+1;
            }
        }
        System.out.println(p);
 
    }
 
}