import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
     int M ,N ,min,max;
        while (((M=input.nextInt())>0) && ((N=input.nextInt())>0)) {
            int sum=0;
            
                if(M > N){
                    max=M;
                    min=N;
                }
                else{
                    max=N;
                    min=M;
                }
                for (int j = min; j <= max; j++) {
                    System.out.print(j+" ");
                    sum=sum+j;
                }
                System.out.println("Sum="+sum);
        }
 
    }
 
}