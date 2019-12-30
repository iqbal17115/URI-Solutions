import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           Scanner input=new Scanner(System.in);
     int T,R1,R2,temp;
     T=input.nextInt();
        for (int i = 0; i < T; i++) {
            R1=input.nextInt();
            R2=input.nextInt();
            temp=R1+R2;
            System.out.println(temp);
        }
 
    }
 
}