import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
        String num;
        num=input.next();
        String[] num1=num.split("");
        int p=0;
        for (int i = 0; i < num1.length; i++) {
            if(num1[i].equals("1")){
                p++;
            }
        }
        if(p%2 != 0){
            System.out.println(num+"1");
        }else{
           System.out.println(num+"0");
        }
 
    }
 
}