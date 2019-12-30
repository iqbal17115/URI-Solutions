import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
        double X,Y;
    double[] N=new double[100];
    X=input.nextDouble();
        for (int i = 0; i < 100; i++) {
            N[i]=X;
            Y=X/2;
            X=Y;
        }
        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f\n",i,N[i]);
        }
 
    }
 
}