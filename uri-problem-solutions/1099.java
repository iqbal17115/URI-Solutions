import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner input=new Scanner(System.in);
int N,X,Y,min,max;
N=input.nextInt();
        for (int i = 0; i < N; i++) {
            int sum=0;
            X=input.nextInt();
            Y=input.nextInt();
            if(X > Y){
                max=X;
                min=Y;
            }
            else{
                max=Y;
                min=X;
            }
            for (int j = min+1; j < max; j++) {
                if(j%2 != 0){
                    sum=sum+j;
                }
            }
            System.out.println(sum);
        }
 
    }
 
}