import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
     int N,S,B,A,S1,B1,A1;
     double ss=0.0,bb=0.0,aa=0.0,s=0.0,b=0.0,a=0.0,result1,result2,result3;
     N=input.nextInt();
     input.nextLine();
     String name;
        for (int i = 0; i < N; i++) {
            name=input.nextLine();
            S=input.nextInt();
            B=input.nextInt();
            A=input.nextInt();
            S1=input.nextInt();
            B1=input.nextInt();
            A1=input.nextInt();
            input.nextLine();
            ss=ss+S;
            bb=bb+B;
            aa=aa+A;
            s=s+S1;
            b=b+B1;
            a=a+A1;
        }
       result1=(s*100)/ss; 
       result2=(b*100)/bb; 
       result3=(a*100)/aa; 
        System.out.printf("Pontos de Saque: %.2f %%.\n",result1);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n",result2);
        System.out.printf("Pontos de Ataque: %.2f %%.\n",result3);
 
    }
 
}