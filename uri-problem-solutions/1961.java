import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
      int P,N,n=0;
      P=input.nextInt();
      N=input.nextInt();
      int[] np=new int[N];
        for (int i = 0; i < N; i++) {
            np[i]=input.nextInt();
        }
        for (int i = 1; i < N; i++) {
            int x=np[i]-np[i-1];
            if(x < 0){
                x *= -1;
            }
            if(P < x){
                    n=1;
                }
        }
        if(n == 1){
            System.out.println("GAME OVER");
        }else{
            System.out.println("YOU WIN");
        }
 
    }
 
}