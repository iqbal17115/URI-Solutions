import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
        int N;
        N=input.nextInt();
        for (int i = 1; i <= (N*4)-1; i+=4) {
            for (int j = i,m=0; m <= 2;m++, j++) {
                System.out.print(j+" ");
            }
            System.out.println("PUM");
        }
 
    }
 
}