import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
       int N;
       N=input.nextInt();
       int X,Y;
        for (int i = 1; i <= N; i++) {
            int sum=0,p=0;
            X=input.nextInt();
            Y=input.nextInt();
            if( X%2 ==0){
                for (int j = X+1; p < Y; j+=2) {
                    sum=sum+j;
                    p++;
                }
            }
            else{
                if( X%2 !=0){
                for (int j = X; p < Y; j+=2) {
                    sum=sum+j;
                    p++;
                }
            }
            }
            System.out.println(sum);
        }
 
    }
 
}