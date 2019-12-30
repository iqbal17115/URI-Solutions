import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           Scanner input=new Scanner(System.in);
     int X,Y,sum=0,min,max;
     X=input.nextInt();
     Y=input.nextInt();
     if(X>Y){
         max=X;
         min=Y;
     }
     else{
         max=Y;
         min=X;
     }
        for (int i = min; i <= max; i++) {
            if(i%13 != 0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
 
    }
 
}