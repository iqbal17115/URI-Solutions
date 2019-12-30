import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner input=new Scanner(System.in);
    int p=0,X,max=-1;
        for (int i = 1; i <= 100; i++) {
            X=input.nextInt();
              if(max < X){
            max=X;
            p=i;
              }
        }
        
        System.out.println(max);
        System.out.println(p);
 
    }
 
}