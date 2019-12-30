import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           Scanner input=new Scanner(System.in);
    int T,length;
    T=input.nextInt();
    input.nextLine();
    String string;
        for (int i = 0; i < T; i++) {
            string=input.nextLine();
            length=string.length();
            if(length > 0 && length <= 25){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
 
    }
 
}