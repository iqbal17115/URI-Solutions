import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           Scanner input=new Scanner(System.in);
       int S,T,F,total;
       S=input.nextInt();
       T=input.nextInt();
       F=input.nextInt();
       total=S+T+F;
       if(total == 24){
           total=0;
       }else if(total > 24){
           total=total-24;
       }else if(total < 0){
           total=total+24;
       }
           System.out.println(total);
 
    }
 
}