import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
       int N;
       while((N=input.nextInt()) != 0){
           int[][] array = new int[N][N];
           int p,a=0,b=0,m=N-1;
           if( N%2 == 0){
               p=N/2;
           }
           else{
               p=(N/2)+1;
           }
           for (int i = 1; i <= p; i++) {
               for (int j = a; j <= m; j++) {
                   for (int k = b; k <= m; k++) {
                       array[j][k]=i;
                   }
               }
               a++;
               b++;
               m--;
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