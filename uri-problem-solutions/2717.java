import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
        int N,A,B,result;
        N=input.nextInt();
        A=input.nextInt();
        B=input.nextInt();
        result=A+B;
        if(result <= N){
            System.out.println("Farei hoje!");
        }else{
            System.out.println("Deixa para amanha!");
        }
 
    }
 
}