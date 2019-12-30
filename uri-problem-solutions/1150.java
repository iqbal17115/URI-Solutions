import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
    int X,Z,p=0,sum=0;
    X=input.nextInt();
    Z=input.nextInt();
    while(X >= Z){
        Z=input.nextInt();
    }
        for (int i = X; i < Z; i++) {
            sum=sum+i;
            p++;
            if(sum > Z){
                break;
            }
        }
        System.out.println(p);
 
    }
 
}