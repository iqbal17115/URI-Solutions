import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input=new Scanner(System.in);
int num;
num=input.nextInt();
        if(num%2 == 0){
            for (int i = num+1; i <= (num+11) ; i=i+2) {
                System.out.println(i);
            }
        }
        else{
            for (int i = num; i <= (num+10); i=i+2) {
                System.out.println(i);
            }
        }
 
    }
 
}