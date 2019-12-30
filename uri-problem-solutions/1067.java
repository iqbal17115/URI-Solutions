import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
int num;
num=input.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }
 
    }
 
}