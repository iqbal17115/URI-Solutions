import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input = new Scanner(System.in);
        int N;
        N=input.nextInt();
        float a,b,c;
        float avg;
        for (int i = 0; i < N; i++) {
            a=input.nextFloat();
            b=input.nextFloat();
            c=input.nextFloat();
            avg=((a*2)+(b*3)+(c*5))/10;
            System.out.printf("%.1f\n",avg);
        }
 
    }
 
}