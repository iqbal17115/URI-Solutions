import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
      int N,M,L,Cm,Cl,A;
      while(input.hasNext()){
      N=input.nextInt();
      M=input.nextInt();
      L=input.nextInt();
      int[][] A1=new int[M][N];
      int[][] A2=new int[L][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A1[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < N; j++) {
                A2[i][j]=input.nextInt();
            }
        }
        Cm=input.nextInt();
        Cl=input.nextInt();
        A=input.nextInt();
        long m=A1[Cm-1][A-1];
        long n=A2[Cl-1][A-1];
        if(m > n){
            System.out.println("Marcos");
        }else if(m < n){
            System.out.println("Leonardo");
        }else if(m==n){
            System.out.println("Empate");
        }
      }
      input.close();
 
    }
 
}