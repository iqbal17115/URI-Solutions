import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
        String str;
        str=input.nextLine();
        String[] str1=str.split(",");
            System.out.println(str1[0]);
            System.out.println(str1[1]);
 
    }
 
}