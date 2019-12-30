import java.io.IOException;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.EOF;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
                Scanner input=new Scanner(System.in);
     int N;
     while(input.hasNext()){
         N=input.nextInt();
         int temp=N-1;
         int[][] array=new int[N][N];
         for (int i = 0; i < N; i++) {
             for (int j = 0; j < N; j++) {
                 if(i == j){
                     array[i][j]=1;
                 }
                 else{
                     array[i][j]=3;
                 }
                 if(j == temp){
                     array[i][j]=2;
                 }
             }
             temp--;
         }
         for (int i = 0; i < N; i++) {
             for (int j = 0; j < N; j++) {
                 System.out.print(array[i][j]);
             }
             System.out.println();
         }
     }
     input.close();
 
    }
 
}