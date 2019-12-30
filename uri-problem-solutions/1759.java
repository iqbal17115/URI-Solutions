import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
      int N;
      N=input.nextInt();
        for (int i = 1; i <= N; i++) {
            if(i != N){
                System.out.print("Ho ");
            }
            else{
                System.out.print("Ho!");
            }
            
        }
        System.out.println();
 
    }
 
}