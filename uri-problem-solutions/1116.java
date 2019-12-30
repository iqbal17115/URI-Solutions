import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
     int N;
     float divide;
     N=input.nextInt();
     float X,Y;
        for (int i = 0; i < N; i++) {
            X=input.nextFloat();
            Y=input.nextFloat();
            if(Y == 0){
                System.out.println("divisao impossivel");
            }
            else{
            divide=(float) (X/Y);
                System.out.printf("%.1f\n",divide);
            }
        }
 
    }
 
}