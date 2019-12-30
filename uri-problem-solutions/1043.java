import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input=new Scanner(System.in);
float A,B,C;
float temp;
A=input.nextFloat();
B=input.nextFloat();
C=input.nextFloat();
        if((A+B)>C && (A+C)>B && (B+C)>A){
            temp=A+B+C;
            System.out.println("Perimetro = "+temp);
        }
        else{
            temp=(float) (.5*(A+B)*C);
            System.out.println("Area = "+temp);
        }
 
    }
 
}