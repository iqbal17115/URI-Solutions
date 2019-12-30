import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
       int X,Y;
       X=input.nextInt();
       Y=input.nextInt();
       int p=X;
        for (int i = 1; i <= Y; i++) {
           
            if(i == p){
                 p=p+X;
                System.out.println(i);
            }
            else{
                System.out.print(i+" ");
            }
        }
 
    }
 
}