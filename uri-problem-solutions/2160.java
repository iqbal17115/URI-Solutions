import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
     String L;
     int length = 0,sum=0;
       while((L=in.readLine()) != null){
      length=L.length();
      sum=sum+length;
    }
     if(sum <= 80){
         System.out.println("YES");
     }else{
         System.out.println("NO");
     }
 
    }
 
}