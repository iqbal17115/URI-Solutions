import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
      int N,p2=0,p3=0,p4=0,p5=0;
      N=input.nextInt();
      int[] L=new int[N];
        for (int i = 0; i < N; i++) {
            L[i]=input.nextInt();
            if(L[i]%2 == 0){
                p2++;
            }
            if(L[i]%3 == 0){
                p3++;
            }
            if(L[i]%4 == 0){
                p4++;
            }
            if(L[i]%5 == 0){
                p5++;
            }
        }
            System.out.println(p2+" Multiplo(s) de 2");
            System.out.println(p3+" Multiplo(s) de 3");
            System.out.println(p4+" Multiplo(s) de 4");
            System.out.println(p5+" Multiplo(s) de 5");
 
    }
 
}