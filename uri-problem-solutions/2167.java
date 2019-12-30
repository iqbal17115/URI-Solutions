import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
        int count=0,N,r,p=0,x=0,y=1,result = 0;
        N=input.nextInt();
        
        for (int i = 0; i < N; i++) {
            r=input.nextInt();
            count++;
            if(r < x && y == 1){
                result=count;
                y=0;
            }
             x=r;
        }
        System.out.println(result);
 
    }
 
}