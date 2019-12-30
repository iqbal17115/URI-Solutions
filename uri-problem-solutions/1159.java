import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
       int X;
       while(((X=input.nextInt()) != 0)){
           int sum=0,p=0;
            if( X%2 == 0){
                for (int j = X; p < 5; j+=2) {
                    sum=sum+j;
                    p++;
                }
            }
            else{
                if( X%2 != 0){
                for (int j = X+1; p < 5; j+=2) {
                    sum=sum+j;
                    p++;
                }
            }
            }
            System.out.println(sum);
       }
      
 
    }
 
}