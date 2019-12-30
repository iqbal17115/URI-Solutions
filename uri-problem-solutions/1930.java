import java.io.IOException;
import java.util.Scanner;
                                            
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input=new Scanner(System.in);
      int T1,T2,T3,T4,total;
      T1=input.nextInt();
      T2=input.nextInt();
      T3=input.nextInt();
      T4=input.nextInt();
      total=(T1+T2+T3+T4)-3;
        System.out.println(total);
 
    }
 
}