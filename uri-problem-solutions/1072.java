import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
int N,in=0,out=0,start=10,end=20;
int X;
N=input.nextInt();
        for (int i = 0; i < N; i++) {
             X=input.nextInt();
            if(X>=start && X<=end){
                in++;
            }
            else{
                out++;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
 
    }
 
}