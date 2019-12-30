import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
       int T,A,B,C,D,E,sum=0;
       T=input.nextInt();
       A=input.nextInt();
       B=input.nextInt();
       C=input.nextInt();
       D=input.nextInt();
       E=input.nextInt();
 
            if(T == A){
                sum=sum+1;
            }
            if(T == B){
                sum=sum+1;
            }
            if(T == C){
                sum=sum+1;
            }
            if(T == D){
                sum=sum+1;
            }
            if(T == E){
                sum=sum+1;
            }
        System.out.println(sum);
 
    }
 
}