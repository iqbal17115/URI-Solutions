import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           Scanner input=new Scanner(System.in);
       int T,N;
       T=input.nextInt();
        for (int i = 1; i <= T; i++) {
            int sum=0;
            N=input.nextInt();
            for (int j = 1; j <= N; j++) {
                if(j%2 != 0){
                    sum=sum+1;
                }else{
                    sum=sum-1;
                }
                
            }
            System.out.println(sum);
        }
 
    }
 
}