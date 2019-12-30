import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
        int C;
       C=input.nextInt();
       String name;
       
        for (int i = 0; i < C+1; i++) {
            name=input.nextLine();
            String[] N=name.split(" ");
            if(!name.equals("")){
            if(N[0].equals("Thor")){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
            }
        }
 
    }
 
}