import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
      int N;
      N=input.nextInt();
      String name;
      double D,sum=0.0;
      double lowest,highest,S;
      
        for (int i = 0; i < N; i++) {
            name=input.next();
            D=input.nextDouble();
            lowest=20;
            highest=-20;
            sum=0.0;
            for (int j = 0; j < 7; j++) {
                S=input.nextDouble();
                if(lowest > S){
                    lowest=S;
            }
                if(highest < S){
                    highest=S;
            }
            sum=sum+S;
            }
            sum=sum-(highest+lowest);
            sum=sum*D;
            System.out.printf("%s %.2f\n",name,sum);
        }
 
    }
 
}