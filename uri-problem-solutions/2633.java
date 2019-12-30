import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
                Scanner input=new Scanner(System.in);
       while(input.hasNext()){
           int N;
           N=input.nextInt();
           String[] str=new String[N];
           int[] D=new int[N];
           for (int i = 0; i < N; i++) {
               str[i]=input.next();
               D[i]=input.nextInt();
           }
           for (int i = 0; i < N; i++) {
               for (int j = 0; j < N; j++) {
                   if(D[i] < D[j]){
                       int temp;
                       String s;
                       temp=D[i];
                       D[i]=D[j];
                       D[j]=temp;
                       s=str[i];
                       str[i]=str[j];
                       str[j]=s;
                   }
               }
           }
           for (int i = 0; i < N; i++) {
               if(i != (N-1)){
               System.out.print(str[i]+" ");
               }else{
                   System.out.print(str[i]);
               }
           }
           System.out.println();
       }
       input.close();
 
    }
 
}