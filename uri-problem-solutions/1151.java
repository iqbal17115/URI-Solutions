import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
   int N;
   int a,b,temp;
   N=input.nextInt();
   a=0;
   b=1;
        for (int i = 1; i <= N; i++) {
            System.out.print(a);
            if(i != N){
                System.out.print(" ");
            }
            else{
                System.out.println();
            }
            temp=a+b;
            a=b;
            b=temp;
        }
 
    }
 
}