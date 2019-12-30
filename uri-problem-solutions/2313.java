import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
                Scanner input=new Scanner(System.in);
        int A,B,C,max,min,mid;
        A=input.nextInt();
        B=input.nextInt();
        C=input.nextInt();
        if(A > B && A > C){
            max=A;
        }
        else if(B > C && B > A){
            max=B;
        }
        else{
            max=C;
        }
        if(A < B && A < C){
            min=A;
        }
        else if(B < C && B < A){
            min=B;
        }
        else{
            min=C;
        }
        mid=(A+B+C)-(max+min);
        if(max >= (min+mid)){
            System.out.println("Invalido");
        }else{
            if(max==min && min==mid){
                System.out.println("Valido-Equilatero");
            }
            else if(max!=min && min!=mid && max!=mid){
                System.out.println("Valido-Escaleno");
            }else{
                System.out.println("Valido-Isoceles");
            }
            if(max*max==(min*min+mid*mid)){
            System.out.println("Retangulo: S");
        }else{
            System.out.println("Retangulo: N");
        }
        }
 
    }
 
}