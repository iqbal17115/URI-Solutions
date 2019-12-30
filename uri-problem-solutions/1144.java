import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
      int N;
      
      N=input.nextInt();
        for (int i = 0,p=1; i < N;p++, i++) {
            for (int j = 1,q=p; j <= (3*2); j++) {
              int a=q;
              int x,d,m;
              x=q;
              m=a*a;
              int n=a*a*a;
              if(j == 1){
                  System.out.print(a+" ");
              }
              else if(j == 2){
                  
                  System.out.print(m+" ");
              }
              else if(j == 3){
                  
                  System.out.println(n);
              }
              else if(j == 4){
                  System.out.print(x+" ");
              }
              else if(j == 5){
                  System.out.print((m+1)+" ");
              }
              else if(j == 6){
                  System.out.println((n+1));
              }
              
            }
        }
 
    }
 
}