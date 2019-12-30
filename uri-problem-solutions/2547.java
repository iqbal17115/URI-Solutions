import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
       int N,Amax,Amin,result;
       while(input.hasNext()){
       N=input.nextInt();
       Amin=input.nextInt();
       Amax=input.nextInt();
       result=0;
       int[] A=new int[N];
        for (int i = 0; i < N; i++) {
            A[i]=input.nextInt();
            if(A[i] >=Amin && A[i]<=Amax){
                result++;
            }
        }
        System.out.println(result);
       }
 
    }
 
}