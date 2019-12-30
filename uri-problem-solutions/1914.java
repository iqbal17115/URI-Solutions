import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner input=new Scanner(System.in);
     int QT;
     QT=input.nextInt();
        for (int i = 0; i < QT; i++) {
            int N,M,sum;
            String s1,s2,e1,e2;
            s1=input.next();
            e1=input.next();
            s2=input.next();
            e2=input.next();
            N=input.nextInt();
            M=input.nextInt();
            sum=N+M;
            if(sum%2 == 0){
                if(e1.equals("PAR")){
                    System.out.println(s1);
                }else{
                    System.out.println(s2);
                }
            }else{
                if(e1.equals("IMPAR")){
                    System.out.println(s1);
                }else{
                    System.out.println(s2);
                }
            }
        }
 
    }
 
}