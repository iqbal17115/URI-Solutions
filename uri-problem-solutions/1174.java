import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
       float[] A=new float[100];
       float x;
        for (int i = 0; i < 100; i++) {
            x=input.nextFloat();
            A[i]=x;
        }
        for (int i = 0; i < 100; i++) {
            if(A[i] <= 10){
                System.out.printf("A[%d] = %.1f\n",i,A[i]);
            }
        }
 
    }
 
}