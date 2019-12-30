import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
     int X,Y,min,max;
     X=input.nextInt();
     Y=input.nextInt();
     if(X > Y){
         max=X;
         min=Y;
     }
     else{
         max=Y;
         min=X;
     }
        for (int i = min+1; i < max; i++) {
            if(i%5==2 || i%5==3){
                System.out.println(i);
            }
        }
 
    }
 
}