import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
       int N;
       while((N=input.nextInt()) != 0){
           int[][] array = new int[N][N];
           int p,a=0,b=1,m=N,r=0;
           for (int i = 0,k=1; i < N;k++, i++) {
               for (int j = 0,q=k; j < N;q++, j++) {
                   if(i == 0){
                   array[i][j]=q;
                   }
                   else{
                       array[i][j]=q;
                       if( i > j){
                       q -= 2;
                       }
                   }
               }
           }
           for (int i = 0; i < N; i++) {
               for (int j = 0; j < N; j++) {
                   if(j == 0){
                       System.out.printf("%3d",array[i][j]);
                   }
                   else{
                       System.out.printf(" %3d",array[i][j]);
                   }
                   
               }
               System.out.println();
           }
           System.out.println();
       }
 
    }
 
}