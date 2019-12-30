import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
      int N,year,temp;
      N=input.nextInt();
        for (int i = 0; i < N; i++) {
            year=input.nextInt();
            if(year > 2015){
                temp=year-2014;
                System.out.println(temp+" A.C.");
            }
            else if(year < 2015){
                temp=2015-year;
                System.out.println(temp+" D.C.");
            }
            else{
                System.out.println("1 A.C.");
            }
        }
 
    }
 
}