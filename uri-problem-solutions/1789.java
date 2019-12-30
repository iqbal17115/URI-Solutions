import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
        int L;
        while(input.hasNext()){
        L=input.nextInt();
        int[] Vi=new int[L];
        int large=Vi[0];
            for (int i = 0; i < L; i++) {
                Vi[i]=input.nextInt();
                if(large<Vi[i]){
                    large=Vi[i];
                }
            }
            if(large < 10){
                System.out.println("1");
            }
            else if(large >= 10 && large < 20){
                System.out.println("2");
            }
            else if(large >= 20){
                System.out.println("3");
            }
        }
        input.close();
 
    }
 
}