import java.io.IOException;
 import java.math.BigInteger;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           Scanner input=new Scanner(System.in);
    BigInteger a=new BigInteger("0");
    BigInteger b=new BigInteger("-1");
    BigInteger d=new BigInteger("1");
    BigInteger P;
    boolean c=false;
    do{
        P=input.nextBigInteger();
        if(P.equals(a)){
            System.out.println("0");
        }
        else if(P.equals(b)){
            c=true;
        }else{
            P=P.subtract(d);
            System.out.println(P);
        }
    }while(c != true);
 
    }
 
}