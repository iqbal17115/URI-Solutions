import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
    int N;
    int a=0,b=1,c=2,d=3,e=4,x;
    while(input.hasNext()){
    N=input.nextInt();
    x=0;
    int y=N-1;
     int[][] array=new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(N/2 == i && N/2 == j){
                    array[i][j]=4;                
            }
                else if((i >= N/3) && (j>=N/3) && ((N-i)>N/3) && (N-j)>N/3){
                 array[i][j]=1; 
            }
                else if(i == j){
                 array[i][j]=2; 
            }
                else if(i==x && j==y){
                    array[i][j]=3;
                }
                else{
                     array[i][j]=0; 
                }
                }
            x++;
            y--;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
 
    }
 
}