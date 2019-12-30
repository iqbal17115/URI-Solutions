import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
        int T;
        int B,Ai,Di,Li,Aii,Dii,Lii,result1=0,result2=0;
        T=input.nextInt();
        for (int i = 0; i < T; i++) {
            B=input.nextInt();
            Ai=input.nextInt();
            Di=input.nextInt();
            Li=input.nextInt();
            Aii=input.nextInt();
            Dii=input.nextInt();
            Lii=input.nextInt();
            result1=(Ai+Di)/2;
            result2=(Aii+Dii)/2;
            if(Li%2 == 0){
                result1 +=B;
            }
            if(Lii%2 == 0){
                result2 +=B;
            }
            if(result1 > result2){
                System.out.println("Dabriel");
            }else if(result1 < result2){
                System.out.println("Guarte");
            }else{
                System.out.println("Empate");
            }
        }
 
    }
 
}