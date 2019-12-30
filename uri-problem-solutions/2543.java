import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
       int N,I,i,j,result;
       while(input.hasNext()){
       N=input.nextInt();
       I=input.nextInt();
       result=0;
        for (int k = 0; k < N; k++) {
            i=input.nextInt();
            j=input.nextInt();
            if(i==I && j==0){
                result++;
            }
        }
        System.out.println(result);
       }
       input.close();
 
    }
 
}