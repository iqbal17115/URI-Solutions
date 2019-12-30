import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
        String date;
        date=input.next();
        String[] str=date.split("/");
        System.out.println(str[1]+"/"+str[0]+"/"+str[2]);
        System.out.println(str[2]+"/"+str[1]+"/"+str[0]);
        System.out.println(str[0]+"-"+str[1]+"-"+str[2]);
 
    }
 
}