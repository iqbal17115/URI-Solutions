import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
       String T;
       int length;
       T=input.nextLine();
       length=T.length();
       if(length <= 140){
           System.out.println("TWEET");
       }else{
           System.out.println("MUTE");
       }
 
    }
 
}