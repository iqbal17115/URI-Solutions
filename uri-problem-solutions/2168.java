import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           Scanner input=new Scanner(System.in);
       int N;
       N=input.nextInt();
       int[][] array=new int[N+1][N+1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                array[i][j]=input.nextInt();
            }
           
        }
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if((array[j][k]+array[j][k+1]+array[j+1][k]+array[j+1][k+1]) <2){
                        System.out.print("U");
                    }else{
                        System.out.print("S");
                    }
                }
                System.out.println();
            }
 
    }
 
}