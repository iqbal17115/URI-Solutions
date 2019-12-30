import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner input=new Scanner(System.in);
      int N;
      N=input.nextInt();
      String st="LIFE IS NOT A PROBLEM TO BE SOLVED";
        System.out.println(st.substring(0, N));
 
    }
 
}