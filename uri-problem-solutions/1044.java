import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
        int A,B;
        A=input.nextInt();
        B=input.nextInt();
        if(B % A == 0 || A % B == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
 
    }
 
}